package TwoPointers.Easy.ValidPalindrome125;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    public static boolean isPalindrome(String s) {
//        s= s.toLowerCase();
//        int i=0;
//        int j= s.length()-1;
//        while (i<=j){
//            if(!checkAscii(s.charAt(i)))
//                i++;
//            else if(!checkAscii(s.charAt(j)))
//                j--;
//            else if (s.charAt(i)== s.charAt(j)){
//                i++;
//                j--;
//            }
//            else
//                return false;
//        }
//        return true;
//    }


    public static boolean isPalindrome(String s) {
        s= s.toLowerCase().replace("[^a-z0-9]", "");
        int i=0;
        int j= s.length()-1;
        while (i<=j){
            if (s.charAt(i)== s.charAt(j)){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }


    private static boolean checkAscii(char c){
        List<Character> num = new ArrayList<>();
        num.add('0');
        num.add('1');
        num.add('2');
        num.add('3');
        num.add('4');
        num.add('5');
        num.add('6');
        num.add('7');
        num.add('8');
        num.add('9');
        return ((int)c >= 97 && (int)c <= 122) || num.contains(c);
    }

    public static void main(String[] args) {
            String s= "0P";
        System.out.println(isPalindrome(s));
    }
}
