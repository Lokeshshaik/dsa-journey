import java.util.*;

public class unionUsingHashSet {
    public static List<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        // Insert all elements from both arrays
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }

        // Convert HashSet to List and sort it
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};

        List<Integer> union = findUnion(a, b);
        System.out.println("Union using HashSet: " + union);
    }
}
