import java.util.Arrays;

public class Exercise {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int sum = nums[i] + nums[j];  // ✅ Correct sum
                if (sum == target) {
                    System.out.println("The sum is " + sum + " using elements at indices " + i + " and " + j);
                    return new int[]{i, j};  // ✅ Return correct indices
                }
            }
        }
        
        // If no result found
        return new int[]{};  // ✅ Return empty array if no pair found
    }
}

class MAIN {
    public static void main(String[] args) {
        Exercise obj = new Exercise();
        int[] nums = {2, 5, 1, 6, 9, 8};
        int target = 7;
        int[] result = obj.twoSum(nums, target);
        System.out.println("Result indices: " + Arrays.toString(result));
    }
}
