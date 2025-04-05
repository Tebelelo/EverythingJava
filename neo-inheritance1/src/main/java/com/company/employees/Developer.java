package com.company.employees;

public class Developer extends Employee {

    private final String programming_language;

    public Developer(String employeeName, String employeeID, int employeeSalary, int previousExperience,String prog_lang) {
        super(employeeName, employeeID, employeeSalary, previousExperience);
        this.programming_language = prog_lang;
    }
    @Override
    public String displayInfo(){
        return "------Employee information----------\n" +
                "Name: " +getName() + "\n" +
                "ID: " +getId()+ "\n" +
                "Salary: R" +getSalary() + "\n" +
                "Age: " +getAge() + "\n"+
                "Programing Language: " + this.programming_language + "\n"+
                "-------------------------------------";
    }
}
