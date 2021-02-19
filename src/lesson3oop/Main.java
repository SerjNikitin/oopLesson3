package lesson3oop;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 12);
        Plate plate = new Plate(10);
        plate.info();
        cat.eat(plate);
        plate.info();
    }
}
