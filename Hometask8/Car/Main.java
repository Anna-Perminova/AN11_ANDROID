public class Main {
    public static void main(String[] args) throws Car.EvenNumberException {
        Car mercedes = new Car("Mercedes", 210, 5000);
        Car opel = new Car("Opel", 240, 4000);
        Car bmw = new Car("BMW", 250, 9000);
        mercedes.start();
        opel.start();
        bmw.start();
    }
}
