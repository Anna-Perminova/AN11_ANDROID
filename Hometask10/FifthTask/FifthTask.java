import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class FifthTask {
    public static void main(String[] args) {
        System.out.println("Enter numbers: ");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        Set<String> numbers = new HashSet<String>();
        numbers.addAll(Arrays.asList(number.split(" ")));
        System.out.println(numbers);
    }
}
