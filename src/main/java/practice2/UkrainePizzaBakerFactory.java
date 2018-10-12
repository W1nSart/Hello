package practice2;

public class UkrainePizzaBakerFactory implements PizzaBakerFactory {
    public AbstractPizzaBaker imgetPizzaBaker(Buttons button) {
        switch (button) {
            case BUTTONS_A:
                FourCheesesBaker fourCheesesBaker = new FourCheesesBaker();
                return fourCheesesBaker;

            case BUTTON_B:
                return new PapperoniBaker();


            case BUTTON_C:
                return new PoloBaker();


            case BUTTON_D:
                return new CarbonaraBaker();
        }

        return null;
    }


    @Override
    public AbstractPizzaBaker getPizzaBaker(Buttons button) {
        return null;
    }
}
