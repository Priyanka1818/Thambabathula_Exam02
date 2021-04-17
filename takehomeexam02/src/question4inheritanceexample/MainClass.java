package question4inheritanceexample;

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Answer for question 4:priyanka thambabathula");
        Bike bike = new Bike(true, 2, 2);
        Car car = new Car(true, 4, true);

        System.out.println(bike.toString());
        System.out.println(car.toString());

    }

}
