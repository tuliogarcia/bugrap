package org.vaadin.training.bugrap.reports;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

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
public class ReportVisualizationDesign extends VerticalLayout {
    protected Label breadcrumb;
    protected VerticalLayout reportCommands;
    protected Link linkOpenReportNewWindow;
    protected Label massModificationDescription;
    protected NativeSelect<org.vaadin.bugrap.domain.entities.Report.Priority> updatePriority;
    protected NativeSelect<org.vaadin.bugrap.domain.entities.Report.Type> updateType;
    protected NativeSelect<org.vaadin.bugrap.domain.entities.Report.Status> updateStatus;
    protected NativeSelect<org.vaadin.bugrap.domain.entities.Reporter> updateAssignedTo;
    protected NativeSelect<org.vaadin.bugrap.domain.entities.ProjectVersion> updateVersion;
    protected Button updateReportCommand;
    protected Button revertReportCommand;
    protected VerticalLayout reportDataLayout;

    public ReportVisualizationDesign() {
        Design.read(this);
    }
}
