import java.util.Scanner;

public class ThirdTask {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите предложение: ");
            String line=sc.nextLine();
            System.out.println("Введите предложение: ");
            String line2=sc.nextLine();
            System.out.println("Введите предложение: ");
            String line3=sc.nextLine();
            String[] sent=new String[3];
            sent[0]=line;
            sent[1]=line2;
            sent[2]=line3;
            for (int i=0; i< sent.length;i++){
                StringBuilder stringBuilder= new StringBuilder(sent[i]);
                stringBuilder.reverse();
                if (stringBuilder.toString().equalsIgnoreCase(sent[i])){
                    System.out.println("Предложение с наибольшим количеством полиндромов: "+sent[i]);
                }
            }

        }}


