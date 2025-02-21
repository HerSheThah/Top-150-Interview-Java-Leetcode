package TwoPointers.Medium.TwoSumii167;

import java.util.Arrays;

public class Main {
    // My solution
//    Search for balance in target from the beginning if not found reduce right pointer by 1
//    and repeat
    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j = numbers.length-1;
        while (i< j){
            int balance = target-numbers[j];
            while (numbers[i]< balance)
                i++;
            if(numbers[i]== balance)
                return new int[]{i+1, j+1};
            else
                j--;
        }
        return new int[]{-1, -1};
    }


    // More optimal leetcode solution
//    public static int[] twoSum(int[] numbers, int target) {
//        int left=0;
//        int right = numbers.length-1;
//        while (left< right){
//            int total = numbers[left]+ numbers[right];
//            if(total== target)
//                return new int[]{left+1, right+1};
//            if(total>target)
//                right--;
//            else
//                left++;
//        }
//        return new int[]{-1, -1};
//    }

    public static void main(String[] args) {
        int[] num1= new int[]{2, 7, 11, 15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(num1, target)));
    }
}
