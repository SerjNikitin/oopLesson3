package lesson3oop;

public class Cat {
    private String name;
    private int appetite;
    private boolean levelEat;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.levelEat = false;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

}

