package TwoPointers.Medium.ContainerMostWater11;

public class Main {
    public static int maxArea(int[] height) {
        int i=0;
        int  j= height.length-1;
        int target=0;
        while (i< j){
            int curInd=j-i;
            if(height[i]< height[j]){
                target=Math.max(target, height[i++]*curInd);
            }
            else{
                target=Math.max(target, height[j--]*curInd); }
        }
        return target;
    }
    public static void main(String[] args) {
        int[] area = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(area));
    }
}
