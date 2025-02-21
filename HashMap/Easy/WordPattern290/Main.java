package HashMap.Easy.WordPattern290;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if(pattern.length() !=arr.length)
            return false;

        for(int i=0; i< pattern.length();i++){
            char curKey =pattern.charAt(i);
            if(map.containsKey(curKey)){
                if(!map.get(curKey).equals(arr[i]))
                    return false;
            }
            else{
                if(map.containsValue(arr[i]))
                    return false;
                map.put(curKey, arr[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
            System.out.println(wordPattern("abba", "dog cat cat fish"));
    }
}
