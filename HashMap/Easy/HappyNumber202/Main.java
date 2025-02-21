package HashMap.Easy.HappyNumber202;

import java.util.HashSet;

public class Main {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        if(n==1)
            return true;
        while (!set.contains(n)){
            set.add(n);
            n = getSum(n);
            if(n==1)
                return true;
        }
        return false;
    }

    private static int getSum(int n) {
        int sum=0;
        while (n >0){
            int rem = n %10;
            sum += rem*rem;
            n = n /10;
        }
        return sum;
    }

    public static void main(String[] args) {
            int n=17;
        System.out.println(isHappy(n));
    }
}
