package aArray.Easy.MajarityElement169;

import java.util.Arrays;

public class Main {
    public static int majorityElement(int[] nums) {
        if(nums.length ==1)
            return nums[1];
        Arrays.sort(nums);
        return nums[(nums.length/2)+1];
    }

//    public int majorityElement(int[] nums) {
//        if(nums.length==1)
//            return nums[0];
//        HashMap<Integer, Integer> hash = new HashMap<>();
//        int n = nums.length;
//        for(int i=0; i< n; i++){
//            int c= nums[i];
//            if(hash.containsKey(c)){
//                int cur= hash.get(c);
//                hash.put(c, cur+1);
//                if(cur+1> n/2)
//                    return c;
//            }else{
//                hash.put(c, 1);
//            }
//        }
//        return 0;
//    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
