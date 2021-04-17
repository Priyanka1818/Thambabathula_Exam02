package question4polymorphism;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Answer for question4 : priyanka thambabathula");
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.type();
        cat.type();
    }
}
