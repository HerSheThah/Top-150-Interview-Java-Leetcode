package HashMap.Easy.Isomorphic205;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for(int i=0; i< s.length(); i++){
            Character curKey= s.charAt(i);
            Character curVal= t.charAt(i);
           if(map.containsKey(curKey)){
               if(map.get(curKey) != curVal)
                   return false;
           }
           else if (map.containsValue(curVal)){
               return false;
           }
           else{
               map.put(curKey, curVal);
           }
        }
        return true;
    }

    public static void main(String[] args) {
        String s= "badc";
        String t= "baba";
        System.out.println(isIsomorphic(s, t));
    }
}
