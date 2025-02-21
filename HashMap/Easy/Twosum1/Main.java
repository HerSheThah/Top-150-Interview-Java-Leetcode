package HashMap.Easy.Twosum1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length;i++){
            int rem = target- nums[i];
            if(map.containsKey(rem))
                return new int[]{map.get(rem), i};
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,9,11,7};
        int target =9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
