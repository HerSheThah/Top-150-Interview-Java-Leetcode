package TwoPointers.Easy.IsSubsequent392;

public class Main {
    public static boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while( i< s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i==s.length();
    }

    public static void main(String[] args) {
            String s = "axa";
            String r="abzba";
        System.out.println(isSubsequence(s, r));
    }
}
