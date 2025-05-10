import java.util.*;

public class MajorityElementFinder {
    
    // Method to find the majority element in the array
    public static int findMajorityElement(int[] nums) {
        // Size of the array
        int n = nums.length;

        // Declaring a map to store the frequency of each element
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        // Storing the elements and their occurrences
        for (int i = 0; i < n; i++) {
            int count = elementCountMap.getOrDefault(nums[i], 0);
            elementCountMap.put(nums[i], count + 1);
        }

        // Searching for the majority element
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > (n / 2)) {
                return entry.getKey();
            }
        }

        // Return -1 if no majority element is found
        return -1;
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        
        // Find the majority element
        int result = findMajorityElement(arr);
        
        // Print the result
        System.out.println("The majority element is: " + result);
    }
}
