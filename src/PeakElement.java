public class PeakElement {

    public static int findPeak(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
                return nums[i];
            }
        }
        // Check the first element
        if (nums[0] >= nums[1]) {
            return nums[0];
        }
        // Check the last element
        if (nums[nums.length - 1] >= nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }
        // No peak found
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 20, 15};
        int peak = findPeak(array);
        if (peak != -1) {
            System.out.println("Peak element: " + peak);
        } else {
            System.out.println("No peak element found.");
        }
    }
}