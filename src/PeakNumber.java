import java.util.ArrayList;
import java.util.List;

public class PeakNumber {

    public static List<Integer> findPeakNumbers(int[] nums) {
        List<Integer> peaks = new ArrayList<>();

        if (nums.length == 0) {
            return peaks;
        }

        if (nums[0] >= nums[1]) {
            peaks.add(nums[0]);
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
                peaks.add(nums[i]);
            }
        }

        if (nums[nums.length - 1] >= nums[nums.length - 2]) {
            peaks.add(nums[nums.length - 1]);
        }

        return peaks;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 4, 5, 7, 6};
        List<Integer> peakNumbers = findPeakNumbers(numbers);

        System.out.println("Peak numbers in the array:");
        for (int peak : peakNumbers) {
            System.out.print(peak + " ");
        }
    }
}
