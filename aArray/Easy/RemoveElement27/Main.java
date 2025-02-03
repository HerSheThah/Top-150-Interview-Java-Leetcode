package aArray.Easy.RemoveElement27;

import java.util.Arrays;

public class Main {
    public static int removeDuplicates(int[] nums) {
        int cur=0;
        for(int i=0; i<nums.length-1; i++){
            if (nums[i]!=nums[i+1]){
                nums[cur++]=nums[i];
            }
        }
        nums[cur++]=nums[nums.length-1];
        return cur;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}