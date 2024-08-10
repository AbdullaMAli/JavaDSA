public class BinarySearch {

    // Method to perform binary search (iterative approach)
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid point

            // Check if target is present at mid
            if (array[mid] == target) {
                return mid; // Target found, return its index
            }

            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                // If target is smaller, ignore the right half
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    // Main method to test the binary search
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        
        int result = binarySearch(array, target);
        
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
