class NikeJacket implements Jacket{
    private String firm;

    public NikeJacket(String firm) {
        this.firm = firm;
    }

    public NikeJacket() {}

    @Override
    public void putOn() {
        System.out.println("Надевет куртку");

    }

    @Override
    public void takeOff() {
        System.out.println("Снимает куртку");

    }

    @Override
    public String getFirm() {
        return firm;
    }
}

