package org.vaadin.training.bugrap.reports;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;
import com.vaadin.ui.declarative.Design;
import org.vaadin.training.bugrap.reports.ReportVisualizationDesign;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class ReportsDesign extends VerticalLayout {
    protected ComboBox<org.vaadin.bugrap.domain.entities.Project> projects;
    protected Label noProjects;
    protected Label username;
    protected Button logout;
    protected NativeSelect<org.vaadin.bugrap.domain.entities.ProjectVersion> versions;
    protected MenuBar assignee;
    protected MenuBar status;
    protected VerticalSplitPanel splitPanel;
    protected Grid<org.vaadin.bugrap.domain.entities.Report> reportsTable;
    protected ReportVisualizationDesign reportVisualization;

    public ReportsDesign() {
        Design.read(this);
    }
}
