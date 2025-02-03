package aArray.Easy.LengthOfLastWord58;

public class Main {
//    public static int lengthOfLastWord(String s) {
//
//        int count =0;
//        for(int i=s.length()-1 ; i>=0 ;i--){
//            if(s.charAt(i)==' '){
//                if(count > 0)
//                    return count;
//            }else{
//                count++;
//            }
//        }
//        return count;
//    }

    // Same solution in a cleaner way
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }

        return length;
    }
    public static void main(String[] args) {
        String s="j Hell";
        System.out.println(lengthOfLastWord(s));
    }
}
