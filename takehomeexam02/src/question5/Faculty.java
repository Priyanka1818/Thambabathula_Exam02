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
public class Faculty extends Employee {
	
	private int officeHours;
	private int numberofTeachingHours;

    public Faculty(int officeHours, int numberofTeachingHours, String office, int salary, String dateHired, String name, String address, int phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.numberofTeachingHours = numberofTeachingHours;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public int getNumberofTeachingHours() {
        return numberofTeachingHours;
    }

    @Override
    public String toString() {
        return "Faculty Name: " +super.getName();
    }
}