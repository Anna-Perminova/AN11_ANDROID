import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Masha");
        people.add("Anya");
        people.add("Dasha");
        people.add("Sasha");
        people.add("Nastya");

        for (String person : people) {
            System.out.println(person);}
        System.out.println("\nRename the second person:");
        people.set(1, "Marina");
        for (String person : people) {
            System.out.println(person);
        }
        System.out.println("\nAdd new person and check if element exists");
        if (people.contains("Katya")) {
            System.out.println("Arraylist has name Katya");
        } else {
            people.add("Katya");
        }
        for (String person : people) {
            System.out.println(person);
        }

        System.out.println("\nDelete last person");
        people.remove(people.size()-1);
        for (String person : people) {
            System.out.println(person);
        }
        people.removeAll(people);

        System.out.println("\nArrayList is empty");
}}
