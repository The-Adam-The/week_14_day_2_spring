package com.employeeapp.example.employeeservicemany.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "employee_number")
    private String employeeNumber;

//    @ManyToMany
//    @JsonIgnoreProperties("employees")
//    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//    @JoinTable(
//            name="employee_projects",
//            joinColumns = {@JoinColumn(
//                    name = "employee_id",
//                    nullable = false,
//                    updatable = false)
//            },
//            inverseJoinColumns = {@JoinColumn(
//            name = "project_id",
//            nullable= false,
//            updatable = false)
//            }
//    )
//    private List<Project> projectList;

    public Employee(String firstName, String lastName, String employeeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
//        this.projectList = new ArrayList<>();
    }

    public Employee() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

//    public void addProject(Project project) {
//        this.projectList.add(project);
//
//    }


}
