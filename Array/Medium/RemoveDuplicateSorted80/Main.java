package Array.Medium.RemoveDuplicateSorted80;

import java.util.Arrays;

public class Main {
    //  *** Non-optimal solution ***
//    public static int removeDuplicates(int[] nums) {
//        int k=0;
//        int count=0;
//        for(int i=0; i<nums.length-1; i++){
//            if(nums[i]==nums[i+1]){
//                count++;
//                if(count<3)
//                    nums[k++]=nums[i];
//            }
//            else{
//                count++;
//                if(count<3)
//                    nums[k++]=nums[i];
//                count=0;
//            }
//        }
//        if(count==2 && nums[nums.length-1]== nums[nums.length-2])
//            return k;
//        if(count<3)
//            nums[k++]=nums[nums.length-1];
//        return k;
//    }

    // *** Efficient solution - Reference ***
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=2)
            return 2;
        int k=2;
        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }
}
