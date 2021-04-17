/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7ex02;

/**
 *
 * @author *priyanka.thambabathula
 */
public enum Grades {
     A("Excellant"), B("very good"), c("good");
    private final String gradeText; 

    private Grades(String gradeText) {
        this.gradeText = gradeText;
    }

    public String getGradeText() {
        return gradeText;
    }
    public static void main(String args[]){
        System.out.println("Answer for question7ex2 :Priyanka Thambabathula");
        System.out.println(Grades.A.getGradeText());
    }
}
    

