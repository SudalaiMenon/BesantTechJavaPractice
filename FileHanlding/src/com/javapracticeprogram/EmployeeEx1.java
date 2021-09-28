package com.javapracticeprogram;

//Exercise1
//Create constructor with access local, instance and static variables.

public class EmployeeEx1 {
    String employeeName;
    String companyName;
    static double empolyeeSalary;

    EmployeeEx1() {
        int employeeId = 201;
        this.employeeName = "Saravanan";
        this.companyName = "BU Soft";
        empolyeeSalary = 15000.00;
        System.out.println("Enter Employee Id: " +employeeId);
        System.out.println("Enter the Employee Name: "+employeeName);
        System.out.println("Enter the Company Name: "+companyName);
        System.out.println("Enter the Employee Salary: "+empolyeeSalary);

    }

    public static void main(String[] args) {
        new EmployeeEx1();
    }
}
