package Array.Medium.ReverseWordsInString151;

public class Main {
    public static String reverseWords(String s) {
        String res="";
        s=s.trim();
        for (int i=0; i<s.length();i++){
            if(s.charAt(i) == ' ' && s.charAt(i-1)==' ')
                continue;
            else
                res+=s.charAt(i);
        }
        s="";
        String[] sArr= res.split(" ");
        for (int j=sArr.length-1; j>=0; j--){
            s+= sArr[j];
            if(j != 0)
                s+=" ";
        }
        return s;
    }



    public static void main(String[] args) {
        String s= "  Hello    world   ";
//        System.out.println(reverseWords(s));
    }
}
