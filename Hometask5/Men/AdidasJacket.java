class AdidasJacket implements Jacket{
    private String firm;

    public AdidasJacket(String firm) {
        this.firm = firm;
    }

    public AdidasJacket() {}

    @Override
    public void takeOff() {
        System.out.println("Снимает куртку");
    }

    @Override
    public String getFirm() {
        return firm;
    }

    @Override
    public void putOn() {
        System.out.println("Надевет куртку");
    }}


