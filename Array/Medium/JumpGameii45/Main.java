package Array.Medium.JumpGameii45;

public class Main {

    public static int jump(int[] nums) {
        int n= nums.length;
        if(n<=1)
            return 0;
        int near=0;
        int jump=0;
        while(near<n-1){
            int far= near+nums[near];
//            jump++;
//            if(far>=n-1)
//                return jump;
            int max= nums[far]+far;
            int maxIndex=far;
            int k=near+1;
            while(k<=far){
                maxIndex=nums[k]+k> max? k: maxIndex;
                k++;
            }
            near=maxIndex;
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{7,8,4,2,0,6,4,1,8,7,1,7,4,1,4,1,2,8,2,7,3,7,8,2,4,4,5,3,5,6,8,5,4,4,7,4,3,4,8,1,1,9,0,8,2};
        System.out.println(jump(nums));
    }
}
