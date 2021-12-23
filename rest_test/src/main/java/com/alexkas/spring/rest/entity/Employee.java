package com.alexkas.spring.rest.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String surname;

    @Column(name = "department_id")
    private String department;

    @Column(name = "salary")
    private int salary;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "data_of_birth")
    private String dataOfBirth;

//    @Column(name = "gender")
//    @Enumerated(EnumType.STRING)
//    private Gender gender;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary, String jobTitle, String dataOfBirth) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.dataOfBirth = dataOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }
}
