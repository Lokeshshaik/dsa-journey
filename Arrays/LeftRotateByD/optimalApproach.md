// Optimal Approach - Using Reversal Algorithm
public class LeftRotateOptimal {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int d, int n) {
        if (d == 0 || d == n) return;

        d = d % n; // If d > n

        reverse(arr, 0, d - 1);       // Reverse first d
        reverse(arr, d, n - 1);       // Reverse rest
        reverse(arr, 0, n - 1);       // Reverse all
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        leftRotate(arr, d, arr.length);
        System.out.print("Array after left rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
