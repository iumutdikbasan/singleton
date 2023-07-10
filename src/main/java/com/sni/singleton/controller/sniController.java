package com.sni.singleton.controller;

import com.sni.singleton.model.ModelSni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class sniController {
    @Autowired
    private ModelSni modelSni;
    @Autowired
    private ModelSni modelSni2;
    @Autowired
    private ModelSni modelSni3;
    @Autowired
    private ModelSni modelSni4;

    @GetMapping("/get-employee")
    public String getEmployee() {
        modelSni.setEmployeename("Umut Dikbasan");
        modelSni2.setEmployeename("Umut Dikbasan 2");
        modelSni3.setEmployeename("Umut Dikbasan 3");
        modelSni4.setEmployeename("Umut Dikbasan 4");

        return String.format(modelSni.getEmployeename(),modelSni2.getEmployeename());
    }
}
