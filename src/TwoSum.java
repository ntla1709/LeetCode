import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;

    }
}