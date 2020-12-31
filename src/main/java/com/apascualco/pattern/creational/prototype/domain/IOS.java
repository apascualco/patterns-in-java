package com.apascualco.pattern.creational.prototype.domain;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class IOS implements OperationSystem {

    private String version;
    private List<String> applications;

    public IOS(final String version) {
        this.version = version;
    }

    @Override
    public IOS clone() throws CloneNotSupportedException {
        return (IOS) super.clone();
    }

    public String getVersion() {
        return version;
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
