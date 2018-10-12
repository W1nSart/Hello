package practice2;

public class Automate {
    public static void main(String[] args) {
//        UkrainePizzaBakerFactory pizzaBakerFactory = new UkrainePizzaBakerFactory();
//        AbstractPizzaBaker pizzaBaker = pizzaBakerFactory.getPizzaBaker(Buttons.BUTTON_C);
//        System.out.println("Съели пиццу " + pizzaBaker.cookPizza());


        PizzaBakerFactory pizzaBakerFactory = new UkrainePizzaBakerFactory();
        AbstractPizzaBaker pizzaBaker = pizzaBakerFactory.getPizzaBaker(Buttons.BUTTON_C);
        System.out.println("Съели пиццу " + pizzaBaker.cookPizza());





    }
}
