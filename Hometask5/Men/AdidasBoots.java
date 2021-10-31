class AdidasBoots implements Boots{
    private String firm;

    public AdidasBoots(String firm) {
        this.firm = firm;
    }

    public AdidasBoots() {}

    @Override
    public void putOn() {
        System.out.println("Надевет кроссовки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает кроссовки");
    }

    @Override
    public String getFirm() {
        return firm;
    }}

