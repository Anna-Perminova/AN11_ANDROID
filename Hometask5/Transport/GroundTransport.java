public class GroundTransport extends Transport{
    private int countWheels,fuel;

    public GroundTransport(int power, int maxSpeed, int weight, String carBrend, int countWheels, int fuel) {
        super(power, maxSpeed, weight, carBrend);
        this.countWheels = countWheels;
        this.fuel = fuel;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Количество колёс: "+countWheels);
        System.out.println("Расход топлива: "+fuel+"л/100км");
    }
}
