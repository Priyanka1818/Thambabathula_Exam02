/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author *priyanka.thambabathula
 */
public class Employee extends Person {
	private String office;
	private int salary;
	private String dateHired;

    public Employee(String office, int salary, String dateHired, String name, String address, int phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee Name: "+super.getName();
    
    }

}
