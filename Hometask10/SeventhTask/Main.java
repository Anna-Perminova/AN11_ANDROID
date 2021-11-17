public class Main {
    public static void main(String[] args) {
        Cocktail milk = new Milk();
        System.out.println("Cost of the milk - " + milk.getCost());
        System.out.println("Milk's components: " + milk.getComponent());

        Cocktail bananaMilk = new BananaMilk((Milk) milk);

        System.out.println("Cost of the banana milk - " + bananaMilk.getCost());
        System.out.println("Cockteil's components: " + bananaMilk.getComponent());

        Cocktail strawberryMilk = new StrawberryMilk((Milk) milk);

        System.out.println("Cost of the strawberry milk - " + strawberryMilk.getCost());
        System.out.println("Cockteil's components: " + strawberryMilk.getComponent());

        Cocktail bananaAndStrawberryMilk = new BananaAndStrawberryMilk((BananaMilk) bananaMilk);

        System.out.println("Cost of the banana and strawberry milk - " + bananaAndStrawberryMilk.getCost());
        System.out.println("Cockteil's components: " + bananaAndStrawberryMilk.getComponent());


    }
}
