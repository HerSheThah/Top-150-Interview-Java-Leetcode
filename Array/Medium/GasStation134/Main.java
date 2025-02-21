package Array.Medium.GasStation134;

public class Main {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int i=0;
        while(i<n){
            if(cost[i]<= gas[i]) {
                int prevGas=gas[i]-cost[i];
                int j = (i+1)%n;
                while(j!=i){
                    if(prevGas+ gas[j] >= cost[j]){
                        prevGas= prevGas+gas[j]-cost[j];
                    }else{
                        i=Math.max(j+1, i+1);
                        break;
                    }
                    j=(j+1)%n;
                }
                if(j==i)
                    return j;
            }else{
                i++;
            }
        }
//        for(int i=0; i< n; i++){
//            if(cost[i]<= gas[i]) {
//                int prevGas=gas[i]-cost[i];
//                int j = (i+1)%n;
//                while(j!=i){
//                    if(prevGas+ gas[j] >= cost[j]){
//                        prevGas= prevGas+gas[j]-cost[j];
//                    }else
//                        break;
//                    j=(j+1)%n;
//                }
//                if(j==i)
//                    return j;
//            }
//        }
        return -1;
    }
//public static int canCompleteCircuit(int[] gas, int[] cost) {
//    int n = gas.length;
//    int[] res= new int[n];
//    int sum=0;
//    for(int i=0; i< n; i++){
//        res[i]=gas[i]- cost[i];
//        sum+=res[i];
//    }
//    for(int i=0; i<n;i++){
//        if(res[i]>=0){
//            int index= i<=0? n-1: (i-1)%n;
//            if(sum- res[index]>0)
//                return i;
//        }
//    }
//    return -1;
//}

    public static void main(String[] args) {
        int[] gas= new int[]{2, 3, 4};
        int[] cost= new int[]{3, 4, 3};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
