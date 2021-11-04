public class AirTransport extends Transport{
    private int wingspan;
    private int minTakeOff;

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinTakeOff() {
        return minTakeOff;
    }

    public void setMinTakeOff(int minTakeOff) {
        this.minTakeOff = minTakeOff;
    }

    public AirTransport(int power, int maxSpeed, int weight, String carBrend, int wingspan, int minTakeOff) {
        super(power, maxSpeed, weight, carBrend);
        this.wingspan = wingspan;
        this.minTakeOff = minTakeOff;}

        @Override
        public void description() {
            super.description();
            System.out.println("Размах крыльев: "+wingspan+"м");
            System.out.println("Минимальная длина взлётно-посадочной полосы для взлёта: "+minTakeOff);
        }
    }

