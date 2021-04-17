/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author *priyanka.thambabathula
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer for Question2 : Priyanka Thambabathula");
        System.out.print("Enter list 1 : ");
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter list 2 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        if (equal(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }
    public static boolean equal(final int[][] m1, final int[][] m2) {
        if (m1 == null) {
            return (m2 == null);
        }
        if (m2 == null) {
            return false;
        }
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            if (!Arrays.equals(m1[i], m2[i])) {
                return false;
            }
        }
        return true;
    }
}
