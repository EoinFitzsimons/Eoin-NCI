/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author eoin0
 */
public class Manager extends Employee {

    private double salary, weekly;
    private String department;

    public Manager(double salary, String department, String name, String id, String dob) {
        super(name, id, dob);
        this.salary = salary;
        this.department = department;
    }

    public Manager() {
        super();
        salary = 0;
    }

    @Override
    public String details() {
        return super.details() + ", salary: " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//    @Override
//    public void computeWeeklyPay() {
//        weekly = salary / 52;
//    }

    public double getWeekly() {
        return weekly;
    }
}
