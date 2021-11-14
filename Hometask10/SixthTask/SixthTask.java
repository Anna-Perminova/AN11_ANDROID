import java.util.*;

public class SixthTask {
    public static void main(String[] args) {
        List<String> listFirst = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        List<String> listSecond = new ArrayList<String>(Arrays.asList("B", "C", "D"));
        SixthTask.union(listFirst, listSecond);
        SixthTask.intersection(listFirst, listSecond);
    }

    public static void union(List<String> listFirst, List<String> listSecond) {
        Set<String> set = new HashSet<String>();
        set.addAll(listFirst);
        set.addAll(listSecond);
        System.out.println(set);
    }

    public static void intersection(List<String> listFirst, List<String> listSecond) {
        List<String> list = new ArrayList<String>();
        for (String line : listFirst) {
            if (listSecond.contains(line)) {
                list.add(line);
                System.out.print(Arrays.asList(line));
            }
        }

    }
}
