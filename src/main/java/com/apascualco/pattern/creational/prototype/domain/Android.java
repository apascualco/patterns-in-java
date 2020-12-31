package com.apascualco.pattern.creational.prototype.domain;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Android implements OperationSystem {

    private String version;
    private String name;
    private List<String> applications;

    public Android(final String version, final String name) {
        this.version = version;
        this.name = name;
    }

    @Override
    public Android clone() throws CloneNotSupportedException {
        return (Android) super.clone();
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public List<String> getApplications() {
        return applications;
    }

    public void addApplication(final String application) {
        if(isNull(this.applications)) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(application);
    }

}
