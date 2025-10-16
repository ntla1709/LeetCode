package Arrays;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{2, 7, 11, 15}));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (var num : nums) {
            set.add(num);
        }
        return nums.length != set.size();
    }
}
