/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author *priyanka.thambabathula
 */
public class RemovingDuplicates {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer for question1 : Priyanka Thambabathula ");
        System.out.print("Enter 10 integers : ");
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add(sc.nextInt());
        }
        ArrayList<Integer> unDuplicatedArray = removeDuplicate(a);
        System.out.print("The distant integers are: ");
        for (Integer num : unDuplicatedArray) {
            System.out.print(num + " ");
        }
    }
    private static ArrayList<Integer> removeDuplicate(ArrayList<Integer> a) {
        // TODO Auto-generated method stub
        ArrayList<Integer> temp = new ArrayList<Integer>();
        // Traverse through the first list
        for (Integer element : a) {
            // If this element is not present in temp
            // then add it
            if (!temp.contains(element)) {
                temp.add(element);
            }
        }
        // return the new list
        return temp;
    }
}
