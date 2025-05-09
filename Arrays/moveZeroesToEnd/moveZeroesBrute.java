// Brute Force Approach - Move Zeroes to End
import java.util.*;

public class MoveZeroesBrute {
    public static int[] moveZeros(int n, int[] a) {
        // Temporary array to hold non-zero elements
        ArrayList<Integer> temp = new ArrayList<>();
        
        // Copy non-zero elements to temp
        for (int i = 0; i < n; i++) {
            if (a[i] != 0)
                temp.add(a[i]);
        }

        // Copy back non-zero elements to the original array
        int nz = temp.size();
        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        // Fill remaining positions with zero
        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int[] ans = moveZeros(n, arr);
        
        System.out.print("After moving zeroes to end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
