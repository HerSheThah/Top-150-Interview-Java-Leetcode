package Array.Easy.LongestCommonPrefix14;

import java.util.Arrays;

public class Main {
    // Great solution reference sort lexico
    public static String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

//    public static String longestCommonPrefix(String[] strs) {
//        if(strs.length==1)
//            return strs[0];
//        int minLength=strs[0].length();
//        for(String s : strs){
//            minLength=Math.min(s.length(), minLength);
//        }
//        StringBuilder res= new StringBuilder();
//        for(int j=0; j < minLength; j++){
//            for(int i=0; i< strs.length-1; i++){
//                if(strs[i].charAt(j)!= strs[i+1].charAt(j))
//                    return res.toString();
//            }
//            res.append(strs[0].charAt(j));
//        }
//        return res.toString();
//
//    }

    public static void main(String[] args) {
        String[] nums = new String[]{"flowerw","fliw","floght"};
        System.out.println(longestCommonPrefix(nums));
    }
}
