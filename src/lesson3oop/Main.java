package lesson3oop;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(30);


        Cat[] cat = {new Cat("Barsik ", 15),
                new Cat("Jora ", 30),
                new Cat("Fedia ", 10),
                new Cat("Boris ", 20),
        };
        for (int i = 0; i < cat.length; i++) {
            plate.takeEat();
            plate.info();
            System.out.print(cat[i].getName());
            cat[i].eat(plate);


        }

    }
}
