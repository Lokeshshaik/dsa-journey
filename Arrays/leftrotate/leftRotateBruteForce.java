public class LeftRotateBruteForce {
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        int[] temp = new int[n];
        
        // Shift elements to the left
        for (int i = 0; i < n - 1; i++) {
            temp[i] = arr[i + 1];
        }
        
        // Wrap around the first element to the end
        temp[n - 1] = arr[0];
        
        // Copy back the result into the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotate(arr, 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
