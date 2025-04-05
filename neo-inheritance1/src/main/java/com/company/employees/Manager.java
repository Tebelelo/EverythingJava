package com.company.employees;

public class Manager extends Employee {
    private final int bonus;

    public Manager(String employeeName, String employeeID, int employeeSalary, int previousExperience) {
        super(employeeName, employeeID, employeeSalary, previousExperience);
        this.bonus =  5 * employeeSalary;
    }

    @Override
    public String displayInfo(){
        return "------Employee information----------\n" +
                "Name: " +getName() + "\n" +
                "ID: " +getId()+ "\n" +
                "Salary: R" +getSalary() + "\n" +
                "Age: " +getAge() + "\n"+
                "Bonus: " +this.bonus +"\n"+
                "-------------------------------------";
    }

    public static void main(String[] arg){
            Manager manager1 =  new Manager("Lekoana Tebelelo","9709245883084",42300,3);
            System.out.println(manager1.displayInfo());
    }
}
