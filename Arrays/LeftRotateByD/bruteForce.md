// Brute Force Approach - Left Rotate by d positions
public class LeftRotateBruteForce {
    public static void leftRotate(int[] arr, int d, int n) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
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
