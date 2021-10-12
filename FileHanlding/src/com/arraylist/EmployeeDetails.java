package com.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class EmployeeDetails {
    String employeeName;
    String employeePosition;
    String employeeTeam;
    int employeeSalary;
    int employeeExperience;


    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public String getEmployeeTeam() {
        return employeeTeam;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeExperience() {
        return employeeExperience;
    }


    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "employeeName='" + employeeName + '\'' +
                ", employeePosition='" + employeePosition + '\'' +
                ", employeeTeam='" + employeeTeam + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeExperience=" + employeeExperience +
                '}';
    }



    EmployeeDetails(String empName, String empPosition, String empTeam, int empSalary, int empExperience) {
        this.employeeName = empName;
        this.employeePosition = empPosition;
        this.employeeTeam = empTeam;
        this.employeeSalary = empSalary;
        this.employeeExperience = empExperience;
    }

}
class Employee{

    public static void main(String[] args) {
        EmployeeDetails employeeDetailsOne = new EmployeeDetails("Sam Winchester", "Manager", "Development", 150000, 15);
        EmployeeDetails employeeDetailsTwo = new EmployeeDetails("Harold James", "Developer", "Development", 90000, 5);
        EmployeeDetails employeeDetailsThree = new EmployeeDetails("James Issac", "Developer", "Development", 70000, 3);
        EmployeeDetails employeeDetailsFour = new EmployeeDetails("Jessica Alba", "HR Manager", "HR", 110000, 10);
        EmployeeDetails employeeDetailsFive = new EmployeeDetails("Kelly Watson", "Asst. HR", "HR", 30000, 3);
        EmployeeDetails employeeDetailsSix = new EmployeeDetails("Benny Wilson", "Admin", "IT", 50000, 2);
        EmployeeDetails employeeDetailsSeven = new EmployeeDetails("Harry Potter", "Fresher", "Development",20000, 1);
        EmployeeDetails employeeDetailsEight = new EmployeeDetails("Cassy Tomas", "Developer", "Development", 50000, 2);
        EmployeeDetails employeeDetailsNine = new EmployeeDetails("Mary Crugar", "Admin", "IT", 10000, 1);
        EmployeeDetails employeeDetailsTen = new EmployeeDetails("Anna Garcia", "Fresher", "Development", 20000, 1);
        EmployeeDetails employeeDetailsEleven = new EmployeeDetails("Will Turner", "Fresher", "Development", 20000, 1);

        ArrayList<EmployeeDetails> emp  = new ArrayList<>();
        emp.add(employeeDetailsOne);
        emp.add(employeeDetailsTwo);
        emp.add(employeeDetailsThree);
        emp.add(employeeDetailsFour);
        emp.add(employeeDetailsFive);
        emp.add(employeeDetailsSix);
        emp.add(employeeDetailsSeven);
        emp.add(employeeDetailsEight);
        emp.add(employeeDetailsNine);
        emp.add(employeeDetailsTen);
        emp.add(employeeDetailsEleven);

       // System.out.println(emp);
        ListIterator<EmployeeDetails> listIterator = emp.listIterator();
        while (listIterator.hasNext()) {
           System.out.println(listIterator.next());

        }
      //  Employee employee = new Employee();
        for(EmployeeDetails getEmp : emp)
        System.out.println("List All the employees Teams :"+ getEmp.employeeTeam);


    }
}
