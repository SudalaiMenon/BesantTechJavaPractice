package com.instancemethodandstaticmethods;

public class InstanceToStaticMethod {
    int empId ;
    String empName;
    double empSalary;
    static String companyName = "TCS";
                      //static method to valueChange the value of static variable
    static void valueChange()
    {
        InstanceToStaticMethod instanceToStaticMethod = new InstanceToStaticMethod();
        companyName = "BU soft tech";
        instanceToStaticMethod.empSalary = 10000.00;
        System.out.println("Employee's Basic Salary:" + instanceToStaticMethod.empSalary);
        System.out.println("Employee company name: " + companyName);
    }
void employeeData(){
        empId = 1001;
        empName = "Saravanan";
         System.out.println("Employee Id: " +empId);
         System.out.println("Employee Name:" +empName);
         valueChange();
    }

    public static void main(String[] args) {
        InstanceToStaticMethod instanceToStaticMethod = new InstanceToStaticMethod();
        instanceToStaticMethod.employeeData();
    }


}
