/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author *priyanka.thambabathula
 */
public enum IceCream {
    
	VENILLA(10), CHOCOLATE(15), MANGO(20), PINEAPPLE(30), STRAWBERRY(25);
        private int price;

    private IceCream(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public static void main(String args[]){
        System.out.println("Answer for question7-example1 :Priyanka Thambabathula");
        System.out.println(IceCream.VENILLA.getPrice());
        System.out.println(IceCream.CHOCOLATE.getPrice());
        System.out.println(IceCream.MANGO.getPrice());
        System.out.println(IceCream.PINEAPPLE.getPrice());
        System.out.println(IceCream.STRAWBERRY.getPrice());
    }
}
    
