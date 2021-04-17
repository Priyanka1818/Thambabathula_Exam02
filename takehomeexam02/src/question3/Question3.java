/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author *priyanka.thambabathula
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Object> list = new ArrayList<>();
    static Loan loan = new Loan("Study loan");
    static Circle circle = new Circle(2);
    static Date date;

    public static void method() {
        list.add(loan);
        list.add(circle);
        //list.add(date);
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        System.out.println("Answer for Question3 : Priyanka Thambabathula");
        method();
    }
}
