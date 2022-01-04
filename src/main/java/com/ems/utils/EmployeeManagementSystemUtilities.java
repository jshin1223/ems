package com.ems.utils;

import com.ems.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystemUtilities {

    public static List<Employee> getEmployeeData() {

        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Joshua", "Shin", "05-26-1981", "Fannie Mae", "1");
        employeeList.add(employee1);
        Employee employee2 = new Employee("Dharmendra", "Sahu", "12-27-1980", "eSystem", "2");
        employeeList.add(employee2);

        return employeeList;
    }
}