package org.vaadin.training.bugrap;

import java.util.function.Supplier;

import org.vaadin.bugrap.domain.BugrapRepository;
import org.vaadin.bugrap.domain.entities.Reporter;
import org.vaadin.training.bugrap.login.LoginView;
import org.vaadin.training.bugrap.reports.ReportsView;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.UI;

/**
 * 
 * @author Tulio Garcia
 *
 */
@SuppressWarnings("serial")
public class BugrapNavigator extends Navigator {

    private BugrapRepository repo;

    private Reporter user;

    /**
     * Initializes with the only view available for users not logged in.
     * 
     */
    public BugrapNavigator(BugrapRepository repo, UI ui,
            ComponentContainer container) {
        super(ui, container);
        this.repo = repo;
        addView(LoginView.PATH, () -> new LoginView(repo));
        navigateTo(LoginView.PATH);
    }

    public void logout() {
        getUI().getPage().setLocation(VaadinServlet.getCurrent()
                .getServletContext().getContextPath());
        getUI().getSession().close();
    }

    public void goToDefault() {
        navigateTo("");
    }

    /**
     * 
     * @param user Loged in user.
     */
    void setUser(Reporter user) {
        if (user == null)
            throw new IllegalArgumentException("Reporter missing");
        this.user = user;
        addRestrictedViews();
    }

    private void addView(String viewName, Supplier<View> supplier) {
        addProvider(new BugrapViewProvider(viewName, supplier));
    }

    /**
     * Adds views accessible after login.
     */
    private void addRestrictedViews() {
        addView(ReportsView.PATH, () -> new ReportsView(this, repo, user));
    }

    /**
     * Provider that creates views on demand.
     */
    static class BugrapViewProvider extends StaticViewProvider {
        private static final View DUMMY = (event) -> {
        };

        private Supplier<View> supplier;

        public BugrapViewProvider(String viewName, Supplier<View> supplier) {
            super(viewName, DUMMY);
            this.supplier = supplier;
        }

        @Override
        public View getView(String viewName) {
            return super.getView(viewName) == DUMMY ? supplier.get() : null;
        }

    }

}
