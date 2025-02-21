package Array.Medium.ProductOfArrayExceptSelf238;

import java.util.Arrays;

public class Main {
//    public static int[] productExceptSelf(int[] nums) {
//        int[]  left = new int[nums.length];
//        int[]  right = new int[nums.length];
//
//        int leftProduct=1;
//        for(int i=0; i< nums.length; i++){
//            left[i]=leftProduct;
//            leftProduct*= nums[i];
//        }
//
//        leftProduct=1;
//        for(int i=nums.length-1; i>=0; i--){
//            right[i]=leftProduct;
//            leftProduct*= nums[i];
//        }
//
//        for(int i=0; i< nums.length;i++){
//            nums[i]=left[i]*right[i];
//        }
//
//        return nums;
//    }

    public static int[] productExceptSelf(int[] nums) {
        int[]  left = new int[nums.length];
        int[]  right = new int[nums.length];

        int leftProduct=1;
        for(int i=0; i< nums.length; i++){
            left[i]=leftProduct;
            leftProduct*= nums[i];
        }

        leftProduct=1;
        for(int i=nums.length-1; i>=0; i--){
            int r=leftProduct*left[i];
            leftProduct*= nums[i];
            nums[i]=r;
        }
        return nums;
    }



    public static void main(String[] args) {
        int[] nums= new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
