package practice2;

public abstract class AbstractPizzaBaker {

    protected final String kindOfPizza;

    protected AbstractPizzaBaker(String kindOfPizza) {
        this.kindOfPizza = kindOfPizza;
    }


    public String cookPizza() {
        getHarvesting();
        addIngridients();
        bake();
        slice();
        box();
        return kindOfPizza;
    }

    private void getHarvesting() {
        System.out.println("Берем заготовку");

    }

    protected abstract void addIngridients();


    protected abstract void bake();


    private void slice() {
        System.out.println("Нарезаем пиццу на 8 кусочков");

    }

    private void box() {
        System.out.println("Упаковать пиццу");
    }


}
