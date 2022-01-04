package com.ems.controller;

import com.ems.model.Employee;
import com.ems.utils.EmployeeManagementSystemUtilities;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ems")
public class EmployeeManagementSystemController {
    @GetMapping("/employees")
    public List<Employee> getEmployeeList() {

        return EmployeeManagementSystemUtilities.getEmployeeData();

    }

}
