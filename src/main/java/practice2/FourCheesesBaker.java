package practice2;

public class FourCheesesBaker extends AbstractPizzaBaker {

    public FourCheesesBaker(){
        super("4 сыра");
    }

    @Override
    protected void addIngridients() {
        System.out.println("Добавление ингредиентов");
        System.out.println("Томаты");
        System.out.println("Камембер");
        System.out.println("Сулугуни");
        System.out.println("Бри");
        System.out.println("Чеддер");


    }

    @Override
    protected void bake() {
            System.out.println("Выпекаем");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
