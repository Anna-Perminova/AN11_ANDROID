public class Passenger extends GroundTransport{
    private String body;
    private int countPassengers;


    public Passenger(int power, int maxSpeed, int weight, String carBrend, int countWheels, int fuel, String body, int countPassengers) {
        super(power, maxSpeed, weight, carBrend, countWheels, fuel);
        this.body = body;
        this.countPassengers = countPassengers;
    }
public void resWork(double time){
double distance=getMaxSpeed()*time;
System.out.println("За время "+time+" ч, автомобиль "+getCarBrend()+" двигаясь с максимальной скоростью "+getMaxSpeed()+" км/ч поедет "+distance+" км и израсходует "+kolFuel(distance)+" литров топлива");

}
private double kolFuel(double distance){
        double kollFuel= (getFuel()*distance)/100;
        return kollFuel;
}
    @Override
    public void description() {
        super.description();
        System.out.println("Тип кузова: "+body);
        System.out.println("Количество пассажиров: "+countPassengers);
    }
}
