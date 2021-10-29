public class Main {
    public static void main(String[] args) {
        AdidasJacket adidasJacket = new AdidasJacket("Adidas");
        AdidasBoots adidasBoots = new AdidasBoots("Adidas");
        AdidasPants adidasPants = new AdidasPants("Adidas");
        NikeBoots nikeBoots = new NikeBoots("Nike");
        NikeJacket nikeJacket = new NikeJacket("Nike");
        NikePants nikePants = new NikePants("Nike");

        Person one = new Person("Adidas", adidasBoots, adidasJacket, adidasPants, "Алёша");
        System.out.println(one.getName() + " носит: " + one.getFirm());
        one.action();
        System.out.println();
        Person two = new Person("Nike", nikeBoots, nikeJacket, nikePants, "Тимоша");
        System.out.println(two.getName() + " носит: " + two.getFirm());
        two.action();
    }
}