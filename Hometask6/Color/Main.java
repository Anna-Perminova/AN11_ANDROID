public class Main {
    public static void main(String[] args) {
        Color color= Color.BLACK;
        System.out.println(color.name()+"\nЗначение r: "+color.getR()+"\nЗначение g: "+color.getG()+"\nЗначение b: "+color.getB());
        color.check();
        Color color1 = Color.WHITE;
        System.out.println(color1.name()+"\nЗначение r: "+color1.getR()+"\nЗначение g: "+color1.getG()+"\nЗначение b: "+color1.getB());
        color1.check();
        Color color2 = Color.PURPLE;
        System.out.println(color2.name()+"\nЗначение r: "+color2.getR()+"\nЗначение g: "+color2.getG()+"\nЗначение b: "+color2.getB());
        color2.check();
        }

}