package aArray.Easy.IndexOfFirstOccurance28;

public class Main {

    // ************************* Using built-in function *************************
//    public static int strStr(String haystack, String needle){
//        for(int i=0; i<=haystack.length()-needle.length(); i++){
//            if(haystack.substring(i, i+needle.length()).equals(needle))
//                return i;
//        }
//        return -1;
//    }
    //    **************************My Code without built-in**************************

    public static int strStr(String haystack, String needle) {
        int i=0;
        int j=0;
        while(i<haystack.length()){
            while (j < needle.length() && i < haystack.length()){
                if(haystack.charAt(i)!= needle.charAt(j)){
                    if(j==0)
                        i++;
                    else{
                        i= i-j+1;
                        j=0;
                    }
                    break;
                }
                else{
                    if(j== needle.length()-1)
                        return i-needle.length()+1;
                    j++;
                    i++;
                }
            }
        }
        return -1;
    }


//    *********************************chatgpt code difficult to understand*********************************
//public static int strStr(String haystack, String needle) {
//    if (needle.isEmpty()) return 0; // Edge case
//
//    int m = haystack.length();
//    int n = needle.length();
//
//    // Step 1: Compute the LPS (Longest Prefix Suffix) array
//    int[] lps = computeLPS(needle);
//
//    // Step 2: Search for needle in haystack using LPS
//    int i = 0, j = 0;
//    while (i < m) {
//        if (haystack.charAt(i) == needle.charAt(j)) {
//            i++;
//            j++;
//            if (j == n) return i - n; // Found match
//        } else {
//            if (j > 0) {
//                j = lps[j - 1]; // Shift `j` using LPS table
//            } else {
//                i++; // Move `i` forward
//            }
//        }
//    }
//    return -1; // No match found
//}
//
//    // Helper function to compute LPS array
//    private static int[] computeLPS(String pattern) {
//        int n = pattern.length();
//        int[] lps = new int[n];
//        int j = 0; // Length of previous longest prefix suffix
//        int i = 1;
//
//        while (i < n) {
//            if (pattern.charAt(i) == pattern.charAt(j)) {
//                j++;
//                lps[i] = j;
//                i++;
//            } else {
//                if (j > 0) {
//                    j = lps[j - 1]; // Shift `j` back
//                } else {
//                    lps[i] = 0;
//                    i++;
//                }
//            }
//        }
//        return lps;
//    }

    public static void main(String[] args) {
        String s="mississippi";
        String y="issip";
        System.out.println(strStr(s, y));
    }
}
