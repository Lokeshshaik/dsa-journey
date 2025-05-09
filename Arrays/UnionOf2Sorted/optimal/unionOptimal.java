import java.util.*;

public class unionOptimal {

    public static List<Integer> findUnion(int[] a, int[] b) {
        List<Integer> al = new ArrayList<>();
        int n1 = a.length, n2 = b.length;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            int small = a[i] < b[j] ? a[i] : b[j];

            if (al.size() == 0 || al.get(al.size() - 1) != small) {
                al.add(small);
            }

            if (a[i] == b[j]) {
                i++;
                j++;
            } else if (small == a[i]) {
                i++;
            } else {
                j++;
            }
        }

        while (i < n1) {
            if (al.get(al.size() - 1) != a[i]) {
                al.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (al.get(al.size() - 1) != b[j]) {
                al.add(b[j]);
            }
            j++;
        }

        return al;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};

        List<Integer> union = findUnion(a, b);
        System.out.println("Union using Optimal Approach: " + union);
    }
}
