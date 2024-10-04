/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author eoin0
 */
public class Employee {

    protected String name;
    protected String id;
    protected String dob;

    public Employee(String name, String id, String dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public Employee() {
        name = " ";
        id = " ";
        dob = " ";
    }

//    public void computeWeeklyPay();

    public String details() {
        return "Employee name: " + name + ", id: " + id;
    }

    public boolean canHireEmployee(Employee e) {
        if (e instanceof Manager) {
            return true;
        } else {
            return false;
        }
    }

    public void modifySalary(Employee e, double salary) {
        if (e instanceof Manager) {
            Manager m = (Manager) e;
            m.setSalary(salary);
            System.out.println("instanceof Manager Salary " + salary);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

}
