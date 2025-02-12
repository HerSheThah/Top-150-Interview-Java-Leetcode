package aArray.Medium.HIndex274;

import java.util.Arrays;

public class Main {
    public static int hIndex(int[] citations) {
        int n = citations.length;

        int result=0;
        Arrays.sort(citations);
        for(int i= n-1; i>=0 ; i--){
            if(citations[i]> n)
                continue;
            if(n-i >= citations[i])
                return citations[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{3,0,6,1,5};
        System.out.println(hIndex(nums));
    }
}
