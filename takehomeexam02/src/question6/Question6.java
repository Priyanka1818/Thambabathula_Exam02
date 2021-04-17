/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author *priyanka.thambabathula
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer for question6 : Priyanka Thambabathula");
        System.out.print("Enter side 1 value of triangle: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 value of triangle: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 value of triangle: ");
        double side3 = sc.nextDouble();

        System.out.print("Enter 'true/false' if the traingle is filled with color: ");
        boolean filled = sc.next().equals("true");
        String color = null;
        if (filled) {
            System.out.print("Enter the color with traingle is filled: ");
            color = sc.next();
        }

        Triangle triangle = new Triangle(side1, side2, side3, filled, color);

        System.out.println(triangle.toString());

    }

}
    
    

