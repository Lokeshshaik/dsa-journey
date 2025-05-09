// Optimal Approach - Move Zeroes to End (In-Place)
import java.util.*;

public class MoveZeroesOptimal {
    public static int[] moveZeros(int n, int[] a) {
        int j = -1;
        
        // Find first zero position
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        // No zero found, return array as is
        if (j == -1) return a;

        // Swap non-zero with first available zero position
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
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
