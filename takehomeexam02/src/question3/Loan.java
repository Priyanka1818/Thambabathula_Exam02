/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author *priyanka.thambabathula
 */
public class Loan {
    private String name;
    @Override
    public String toString() {
	return "Loan name:" + name;
    }
    public Loan(String name) {
	super();
	this.name = name;
    }
}

