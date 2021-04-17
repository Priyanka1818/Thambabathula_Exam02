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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question5 : Priyanka Thambabathula");
        Person P = new Person("Priya", "1215 West,Apt:14",123456,"Priyanka@gmail.com");
        Employee Q = new Employee("TCS",3000,"1/9/2020","Priyanka","Maryville",78910,"Vinny@gmail.com");
        Faculty R = new Faculty(3,3,"professor",6000,"3/8/2016","Thambabathula","Kansas",233567,"Harsha@gmail.com");
        Staff S = new Staff("Admin","WIPRO",60000,"4/23/2018","Prasad","Texas",7366553,"Krishna@gmail.com");
        Student T = new Student("A","Devi","Virginia",8345676,"Sai@gmail.com");
        System.out.println(P.toString());
        System.out.println(Q.toString());
        System.out.println(R.toString());
        System.out.println(S.toString());
        System.out.println(T.toString());
       
    }
}

        
        
    


    
    

