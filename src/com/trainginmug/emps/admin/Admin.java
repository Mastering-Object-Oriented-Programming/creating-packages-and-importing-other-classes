package com.trainginmug.emps.admin;

import com.trainginmug.emps.employee.Payroll;

public class Admin {

    String name;
    String email;

    Payroll payroll;

    public Admin() {
        payroll = new Payroll();
    }

    public Admin(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void processSalary(){
        //invoke ProcessSalary method

    }

}
