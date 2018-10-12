package practice2;

public class CarbonaraBaker extends AbstractPizzaBaker {

    public CarbonaraBaker(){
        super("Carbonara");
    }

    @Override
    protected void addIngridients() {
        System.out.println("Добавление ингредиентов");
        System.out.println("Томаты");
        System.out.println("Cыр");
        System.out.println("Ветчина");
        System.out.println("Зелень");
        System.out.println("Соус");

    }

    @Override
    protected void bake() {
        System.out.println("Выпекаем");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
