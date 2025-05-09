import java.util.*;

public class unionUsingTreeSet {
    public static List<Integer> findUnion(int[] a, int[] b) {
        TreeSet<Integer> set = new TreeSet<>();

        // Insert all elements from both arrays
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }

        // Convert TreeSet to ArrayList
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};

        List<Integer> union = findUnion(a, b);
        System.out.println("Union using TreeSet: " + union);
    }
}
