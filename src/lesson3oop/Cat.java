package lesson3oop;

public class Cat {
    private String name;
    private int appetite;
    private boolean levelEat;


    public String getName() {
        return name;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.levelEat=false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            System.out.println( levelEat = true);
            return;
        } else System.out.println("еды слишком мало:(");
        System.out.println(levelEat = false);


    }

}

