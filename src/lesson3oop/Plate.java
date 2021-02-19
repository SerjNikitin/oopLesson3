package lesson3oop;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (n <= food) {
            food -= n;
        } else System.out.println("еды слишком мало");
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
