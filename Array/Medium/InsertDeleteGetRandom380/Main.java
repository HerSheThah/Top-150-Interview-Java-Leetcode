package Array.Medium.InsertDeleteGetRandom380;


public class Main {
    public static void main(String[] args) {
        int[] nums= new int[]{1, 2, 3, 4};
        RandomizedSet r = new RandomizedSet();
        r.insert(2);
        r.insert(5);
        r.insert(3);
        r.insert(1);
        System.out.println("******");
        System.out.println(r.list);
        System.out.println(r.map);
        System.out.println("******");
        r.remove(5);
        System.out.println("******");
        System.out.println(r.list);
        System.out.println(r.map);
        System.out.println(r.list.size());
        System.out.println("******");
        System.out.println(r.getRandom());
        System.out.println(r.getRandom());
        System.out.println(r.getRandom());
    }
}
