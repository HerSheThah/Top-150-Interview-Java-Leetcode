package aArray.Medium.RotateArray189;

import java.util.Arrays;

public class Main {
//    public static void rotate(int[] nums, int k) {
//        if(nums.length<=1)
//            return;
//        int n = nums.length;
//        k= (n-k)%n;
//        for(int i=0; i<k;i++){
//            int temp = nums[nums.length-1];
//            for(int j=0; j<n-1;j++){
//                nums[j+1]=nums[j];
//            }
//            nums[0]=temp;
//        }
//
//    }
    // *** o(n) o(n) solution ***
//public static void rotate(int[] nums, int k) {
//    if(nums.length<=1)
//        return;
//    int n = nums.length;
//    k= k%n;
//    int[] res= new int[n];
//    int pos=0;
//    for(int i=k; i<n;i++){
//        res[i]=nums[pos++];
//    }
//    for(int i=0; i<k; i++){
//        res[i]=nums[pos++];
//    }
//
//    System.arraycopy(res, 0, nums, 0, n);
//}

    // **** Optimised one o(n) o(1) => Memory ****
    public static void rotate(int[] nums, int k) {
        if(nums.length<=1)
            return;
        int n = nums.length;
        k= k%n;
        Reverse(nums, 0, n-1);
        Reverse(nums, 0, k-1);
        Reverse(nums, k, n-1);
    }

    private static void Reverse(int[] num, int left, int right){
        while(left< right){
            int temp = num[left];
            num[left]= num[right];
            num[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2, 3, 4, 5, 6, 7};
        int k=3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
