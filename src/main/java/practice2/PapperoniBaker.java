package practice2;

public class PapperoniBaker extends AbstractPizzaBaker {

    public PapperoniBaker(){
        super("Папперони");
    }

    @Override
    protected void addIngridients() {
        System.out.println("Добавление ингредиентов");
        System.out.println("Томаты");
        System.out.println("Перец");
        System.out.println("Салями");
        System.out.println("Бри");
        System.out.println("Специи");
        System.out.println("Грибы");


    }

    @Override
    protected void bake() {
            System.out.println("Выпекаем");
            try {
                Thread.sleep(21000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
