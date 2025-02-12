package cHashMap.RansomNote383;

import java.util.Arrays;

public class Main {
    public static boolean canConstruct(String ransomNote, String magazine) {
       char[] randomArray= ransomNote.toCharArray();
       Arrays.sort(randomArray);
       char[] magazineArray = magazine.toCharArray();
       Arrays.sort(magazineArray);

        ransomNote= Arrays.toString(randomArray);
        magazine= Arrays.toString(magazineArray);

        return magazine.contains(ransomNote);

    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aagh", "aabgh"));

    }
}
