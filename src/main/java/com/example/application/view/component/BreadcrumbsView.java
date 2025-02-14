package com.example.application.view.component;

import com.example.application.component.Breadcrumb;
import com.example.application.component.BreadcrumbItem;
import com.example.application.view.HomeView;
import com.example.application.view.MainLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;

@PageTitle("Breadcrumbs")
@Route(value = "breadcrumbs", layout = MainLayout.class)
public class BreadcrumbsView extends ComponentView {

    public BreadcrumbsView() {
        addClassNames(Padding.Top.LARGE);

        add(new Breadcrumb(
                new BreadcrumbItem("Home", HomeView.class),
                new BreadcrumbItem("Breadcrumbs", BreadcrumbsView.class)
        ));
    }

}
