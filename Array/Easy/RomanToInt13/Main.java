package Array.Easy.RomanToInt13;

import java.util.HashMap;
import java.util.Map;

public class Main {
//    public static int romanToInt(String s) {
//        int total=0;
//        Map<Character, Integer> romans = new HashMap<>();
//        romans.put('I', 1);
//        romans.put('V', 5);
//        romans.put('X', 10);
//        romans.put('L', 50);
//        romans.put('C', 100);
//        romans.put('D', 500);
//        romans.put('M', 1000);
//
//        for(int i=0; i<s.length(); i++){
//            if( i != s.length()-1){
//                if((s.charAt(i) == 'I' && (s.charAt(i+1)== 'V' || s.charAt(i+1)=='X')) ||
//                        (s.charAt(i) == 'X' && (s.charAt(i+1)== 'L' || s.charAt(i+1)=='C'))||
//                        (s.charAt(i) == 'C' && (s.charAt(i+1)== 'D' || s.charAt(i+1)=='M'))){
//                    total-=romans.get(s.charAt(i));
//                }
//                else{
//                    total += romans.get(s.charAt(i));
//                }
//            }else{
//                total += romans.get(s.charAt(i));
//            }
//        }
//        return total;
//    }
    // Optimised solution
    public static int romanToInt(String s) {
        int total=0;
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        for(int i=0; i<s.length()-1; i++){

            if(romans.get(s.charAt(i))< romans.get(s.charAt(i+1)))
                total -= romans.get(s.charAt(i));
            else
                total += romans.get(s.charAt(i));
        }
        total += romans.get(s.charAt(s.length()-1));

        return total;
    }
    public static void main(String[] args) {
        String s=  "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
