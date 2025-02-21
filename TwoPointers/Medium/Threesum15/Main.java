package TwoPointers.Medium.Threesum15;

import java.util.*;

public class Main {
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> res= new ArrayList<>();
//        int n = nums.length;
//        Map<Integer, List<Integer>> resMap= new HashMap<Integer, List<Integer>>();
//        for(int i=0; i< n; i++){
//            int fix = nums[i];
//            Map<Integer, Integer> map = new HashMap<>();
//            for(int j = 1; j<n; j++){
//                int x= -fix-nums[j];
//                if(map.containsKey(x)){
//                    List<Integer> cur= new ArrayList<>();
//                    int key=0;
//                    int val1=0;
//                    int val2=0;
//                    if(fix>x){
//                        if(nums[j]> fix){
//                            key= nums[j];
//                            val1=fix;
//                            val2=x;
//                        }
//                        else{
//                            key= fix;
//                            val1=nums[j];
//                            val2=x;
//                        }
//                    }else{
//                        if(nums[j]> x){
//                            key= nums[j];
//                            val1=x;
//                            val2=fix;
//                        }
//                        else{
//                            key= x;
//                            val1=nums[j];
//                            val2=fix;
//                        }
//                    }
//                    cur.add(val1);
//                    cur.add(val2);
//                    if(!resMap.containsKey(key) && !resMap.containsValue(cur)){
//                        resMap.put(key, cur);
//                    }
//                }
//                else
//                    map.put(nums[j], j);
//            }
//        }
//
//        for(Map.Entry<Integer, List<Integer>>entry: resMap.entrySet()){
//            entry.getValue().add(entry.getKey());
//            res.add(entry.getValue());
//        }
//        return res;
//    }

        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i-1]) {
                    continue;
                }

                int j = i + 1;
                int k = nums.length - 1;

                while (j < k) {
                    int total = nums[i] + nums[j] + nums[k];

                    if (total > 0) {
                        k--;
                    } else if (total < 0) {
                        j++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;

                        while (nums[j] == nums[j-1] && j < k) {
                            j++;
                        }
                    }
                }
            }
            return res;
        }


    public static void main(String[] args) {
        int[] nums =new int[] {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
