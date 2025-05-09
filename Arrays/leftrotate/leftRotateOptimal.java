public class LeftRotateOptimal {
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        int temp = arr[0];
        
        // Shift the array to the left by one position
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        
        // Place the first element at the last position
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotate(arr, 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
