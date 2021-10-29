public class Truck extends GroundTransport{
    private int lifting;
    public Truck(int power, int maxSpeed, int weight, String carBrend, int countWheels, int fuel, int lifting) {
        super(power, maxSpeed, weight, carBrend, countWheels, fuel);
        this.lifting = lifting;}
public void resBus(double countLifting){
        if (countLifting>lifting){
            System.out.println("Вам нужен другой грузовик");
        }else {
            System.out.println("Грузовик загружен");
        }

    }
        @Override
        public void description() {
            super.description();
            System.out.println("Грузоподъёмность: "+lifting+"т");
        }
    }

