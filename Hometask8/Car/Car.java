import java.util.Random;

public class Car {
    private String carBrend;
    private int speed;
    private int cost;

    public Car() {
    }

    public Car(String carBrend, int speed, int cost) {
        this.carBrend = carBrend;
        this.speed = speed;
        this.cost = cost;
    }

    public String getCarBrend() {
        return carBrend;
    }

    public void setCarBrend(String carBrend) {
        this.carBrend = carBrend;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    class EvenNumberException extends Exception {
        public EvenNumberException(String name) {
            super("Машина " + name + " сломалась");
        }
    }

    public void start() throws EvenNumberException {
        Random random = new Random();
        int number = random.nextInt(21);
        try {
            if (number % 2 == 0) {
                throw new EvenNumberException(carBrend);
            }
            System.out.println("Машина " + carBrend + " завелась");

        } catch (EvenNumberException e) {
            e.printStackTrace();
        }
    }
}
