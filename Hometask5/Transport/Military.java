public class Military extends AirTransport{
    private boolean bailout;
    private int countRocket;

    public Military(int power, int maxSpeed, int weight, String carBrend, int wingspan, int minTakeOff, boolean bailout, int countRocket) {
        super(power, maxSpeed, weight, carBrend, wingspan, minTakeOff);
        this.bailout = bailout;
        this.countRocket = countRocket;}

    public void resPlane1() {
        if (bailout=true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
            if (countRocket!=0){
                System.out.println("Ракеты пошли");
            }else {
                System.out.println("Боеприпасы отсутствуют");
            }

    }
    @Override
    public void description() {
        super.description();
        System.out.println("Наличие системы катапультирования: "+bailout);
        System.out.println("Количество ракет на борту: "+countRocket);
    }
}

