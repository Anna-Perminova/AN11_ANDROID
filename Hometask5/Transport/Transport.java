public class Transport {
    private int power,maxSpeed,weight;
    private String carBrend;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCarBrend() {
        return carBrend;
    }

    public void setCarBrend(String carBrend) {
        this.carBrend = carBrend;
    }

    public Transport(int power, int maxSpeed, int weight, String carBrend) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.carBrend = carBrend;
    }
    public double kv(){
        double res=getPower()*0.74;
        return res;
    }
    public void description(){
        System.out.println("Мощность: "+power+"лошадиные силы");
        System.out.println("Максимальная скорость: "+maxSpeed+"км/ч");
        System.out.println("Вес: "+weight+"кг");
        System.out.println("Марка транспорта: "+carBrend);
        System.out.println("Рассчёт мощности в киловаттах: "+kv());
    }
}
