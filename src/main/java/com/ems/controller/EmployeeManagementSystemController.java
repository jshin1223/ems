package com.ems.controller;

import com.ems.model.Employee;
import com.ems.utils.EmployeeManagementSystemUtilities;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ems")
public class EmployeeManagementSystemController {

    /**
     * This method returns all employee data
     * @return List of employee data
     */
    @GetMapping("/employees")
    public List<Employee> getEmployeeList() {

        return EmployeeManagementSystemUtilities.getEmployeeData();

    }

    /**
     * This method returns employee data by id
     * @param id
     * @return Employee object
     */
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") String id) {

        List<Employee> employeeList = EmployeeManagementSystemUtilities.getEmployeeData();

        if (StringUtils.hasText(id)) {
            for (Employee employee : employeeList) {
                if (id.equals(employee.getEmployeeID())) {
                    return employee;
                }
            }
        }

        return new Employee();

    }

}
