package com.company.employees;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String name;
    private final String id;
    private final int experience;
    private int salary;
    private int minimum_salary = 10000;
    private int age;

    public Employee(String employeeName,String employeeID,int employeeSalary,int previousExperience){

        if(employeeName == null) throw new NullPointerException("Employee name cannot be null");
        if (employeeName.isEmpty()) throw new IllegalArgumentException("Enter enployee real name");
        this.name = employeeName;

        this.age = LocalDate.now().getYear() - this.getDateOfBirth(employeeID).getYear();
        if(age > 35  && previousExperience < 1 || age >=60) throw new IllegalArgumentException("You do not qualify");
        this.id = employeeID;

        if(previousExperience < 0) throw new IllegalArgumentException("Experience cannot be negative");
        this.experience = previousExperience;

        if(employeeSalary < this.minimum_salary) throw new IllegalArgumentException("Invalid salary");
        this.salary = employeeSalary;

    }
    private LocalDate getDateOfBirth(String employeeID){

        if(employeeID == null) throw new NullPointerException("Employee name cannot be null");

        String dateOfBirth = employeeID.substring(0,6);
        String correctDateOfBirth = "19";

        if(employeeID.length() == 13 && employeeID.matches("\\d+")){
            int count = 0;
            for(char num: dateOfBirth.toCharArray()){
                int counter = dateOfBirth.length();
                correctDateOfBirth += num;
                count ++;
                if(count % 2 == 0){
                    if(count != dateOfBirth.length()){
                        correctDateOfBirth += ",";
                    }
                }
            }
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd");
        LocalDate dob;
        dob = LocalDate.parse(correctDateOfBirth,formatter);
        return dob;
    }

    public String displayInfo(){

        return "------Employee information----------\n" +
                "Name: " +this.name + "\n" +
                "ID: " +this.id + "\n" +
                "Salary: R" +this.salary + "\n" +
                "Age: " +this.age + "\n"+
                "-------------------------------------";
    }

    public String getName(){
        return this.name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args){
        Employee employee1 = new Employee("Tebelelo","9909255883084",12000,1);
        System.out.println(employee1.displayInfo());

    }
}
