import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String line=sc.nextLine();
        System.out.println("Введите значение с которого вы бы хотели вырезать: ");
        int firstSymbol=sc.nextInt();
        System.out.println("Введите значение на котором вы бы закончили вырезать: ");
        int lastSymbol=sc.nextInt();
        StringBuffer sentense= new StringBuffer(line);
        String cutting= sentense.substring(firstSymbol,lastSymbol);
        System.out.println("Результат вырезания: "+cutting);
    }
}
