class SamsungLegs  implements ILeg {
    private int price;

    public SamsungLegs(int price) {
        this.price = price;
    }

    public SamsungLegs() {}

    @Override
    public void step() {
        System.out.println("Двигает ногами Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }

}

