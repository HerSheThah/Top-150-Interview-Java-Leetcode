package aArray.Medium.JumpGame55;

public class Main {

    public static boolean canJump(int[] nums) {
        if(nums.length<=1)
            return true;
        int n = nums.length-1;
        int i=n-1;
        boolean res=false;
        while(i>=0){
            if(nums[i] >= n-i){
                n=i;
                res=true;
            }else{
                res=false;
            }
            i--;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums= new int[]{0};
        System.out.println(canJump(nums));
    }
}
