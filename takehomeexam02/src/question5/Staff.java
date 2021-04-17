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
public class Staff extends Employee {
	
	private String title;

    public Staff(String title, String office, int salary, String dateHired, String name, String address, int phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Staff Name: "+super.getName();
    }
}
