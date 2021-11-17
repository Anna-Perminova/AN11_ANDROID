class AdidasPants implements Pants {
    private String firm;

    public AdidasPants(String firm) {
        this.firm = firm;
    }

    public AdidasPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Надевет штаны");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает штаны");
    }

    @Override
    public String getFirm() {
        return firm;
    }
}

