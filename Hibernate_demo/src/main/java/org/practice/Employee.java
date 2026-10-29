package org.practice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "emp_id")
    private int emp_id;

    @Column(name = "emp_name")
    private String emp_name;

    @Column(name = "branch")
    private String branch;

    public Employee() {
    }

    public Employee(int emp_id, String emp_name, String branch) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.branch = branch;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
