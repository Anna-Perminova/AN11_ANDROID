public class BananaMilk implements Cocktail{
   private Milk milk;
   public BananaMilk(Milk milk){
       this.milk=milk;
   }
    @Override
    public int getCost() {
        return this.milk.getCost()+5;
    }

    @Override
    public String getComponent() {
        return this.milk.getComponent()+", banana";
    }
}
