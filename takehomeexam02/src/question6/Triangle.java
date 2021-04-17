/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author *priyanka.thambabathula
 */
public class Triangle extends GeometricObject {

    public double side1;

    public double side2;

    public double side3;

    public boolean filled;

    public String color;

    public Triangle(double side1, double side2, double side3, boolean filled, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.filled = filled;
        this.color = color;
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2.0;
        double a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return Math.round(a * 100) / 100.00;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Area: " + area() + ", Perimeter: " + perimeter() + ", color: "
                + color + ", filled: " + filled;
    }

}