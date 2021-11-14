public class StrawberryMilk implements Cocktail{
        private Milk milk;
        public StrawberryMilk(Milk milk){
            this.milk=milk;
        }
        @Override
        public int getCost() {
            return this.milk.getCost()+7;
        }

        @Override
        public String getComponent() {
            return this.milk.getComponent()+", strawberry";
        }
    }


