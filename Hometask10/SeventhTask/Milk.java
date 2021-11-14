public class Milk implements Cocktail {
   private int cost= 10;
   private String component="milk";

    @Override
    public int getCost() {
        return this.cost;
    }


    @Override
    public String getComponent() {
        return this.component;
    }
}
