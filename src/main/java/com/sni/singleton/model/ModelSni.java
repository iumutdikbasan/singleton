package com.sni.singleton.model;

import org.springframework.stereotype.Component;

@Component
public class ModelSni {
    private String employeename;

    public ModelSni() {
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }
}
