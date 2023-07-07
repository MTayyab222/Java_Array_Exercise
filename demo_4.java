import java.util.Arrays;
import java.util.Random;

public class demo_4 {
    public static void shuffleArray(int[] nums) {
        Random random = new Random();

        for (int i = nums.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap elements at i and j
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(nums));

        shuffleArray(nums);

        System.out.println("Shuffled array: " + Arrays.toString(nums));
    }
}
