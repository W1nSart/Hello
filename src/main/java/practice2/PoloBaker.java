package practice2;

public class PoloBaker extends AbstractPizzaBaker {

    public PoloBaker(){
        super("Поло");
    }

    @Override
    protected void addIngridients() {
        System.out.println("Добавление ингредиентов");
        System.out.println("Оливки");
        System.out.println("Ветчина");
        System.out.println("Ананас");
        System.out.println("Курица");


    }

    @Override
    protected void bake() {
            System.out.println("Выпекаем");
            try {
                Thread.sleep(18000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
