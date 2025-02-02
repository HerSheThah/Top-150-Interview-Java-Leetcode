package aArray.RemoveElement27;

import java.util.Arrays;

public class Main {
    public static int removeElement(int[] nums, int val) {
        int i=0;
        for(int k=0; k<nums.length;k++){
            if(nums[k] != val){
                nums[i++]= nums[k];
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}