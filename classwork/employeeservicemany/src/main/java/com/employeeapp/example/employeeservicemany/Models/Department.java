package com.employeeapp.example.employeeservicemany.Models;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;

    private List<Employee> employeeList;

    public Department(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public Department() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }
}
