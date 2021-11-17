import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String line=sc.nextLine();
        StringBuffer sentense= new StringBuffer(line);
        char symbol=sentense.charAt(3);
        char replaceSymbol=sentense.charAt(0);
        String replace= line.replace(symbol,replaceSymbol);
        System.out.println("Результат замены: "+replace);
    }
}