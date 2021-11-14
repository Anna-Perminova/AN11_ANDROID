public class BananaAndStrawberryMilk implements Cocktail {
    private BananaMilk bananaMilk;
    public BananaAndStrawberryMilk(BananaMilk bananaMilk){
        this.bananaMilk=bananaMilk;
    }

    @Override
    public int getCost() {
        return this.bananaMilk.getCost()+7;
    }

    @Override
    public String getComponent() {
        return this.bananaMilk.getComponent()+", strawberry";
    }
}

