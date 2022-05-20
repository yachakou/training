package training.interview.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    //brut force
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (int num : nums) {
            if (integerSet.contains(num))
                return true;
            integerSet.add(num);
        }
        return false;
    }
}
