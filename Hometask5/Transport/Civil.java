public class Civil extends AirTransport{
    private int countPassenger;
    private boolean business;


    public Civil(int power, int maxSpeed, int weight, String carBrend, int wingspan, int minTakeOff, int countPassenger, boolean business) {
        super(power, maxSpeed, weight, carBrend, wingspan, minTakeOff);
        this.countPassenger = countPassenger;
        this.business = business;}

    public void resPlane(double Passenger){
        if (Passenger>countPassenger){
            System.out.println("Вам нужен другой самолёт");
        }else {
            System.out.println("Самолёт загружен");
        }}
        @Override
        public void description() {
            super.description();
            System.out.println("Количество пассажиров: "+countPassenger);
            System.out.println("Наличие бизнес класса : "+business);
        }

    }

