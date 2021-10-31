class NikePants implements Pants{
    private String firm;

    public NikePants(String firm) {
        this.firm = firm;
    }

    public NikePants() {}

    @Override
    public void putOn() {System.out.println("Надевает штаны");

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

