package aArray.Easy.MergeSortedArray88;

import java.util.Arrays;

public class Main {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            if(n==0)
                return;
            int endIndex= m+n-1;
            while(m>0 && n>0){
                if(nums1[m-1] > nums2[n-1]){
                    nums1[endIndex]= nums1[m-1];
                    m--;
                }
                else{
                    nums1[endIndex]=nums2[n-1];
                    n--;
                }
                endIndex--;
            }
            while(n>0){
                nums1[endIndex--]= nums2[n-1];
                n--;
            }
    }

    public static void main(String[] args) {
        int[] nums2 = new int[]{2, 5, 6};
        int[] nums1 = new int[]{1, 2, 3,0, 0, 0};
        int m=3;
        int n=3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
