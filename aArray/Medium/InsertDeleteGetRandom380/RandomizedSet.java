package aArray.Medium.InsertDeleteGetRandom380;

import java.util.*;

public class RandomizedSet {
        public Map<Integer, Integer> map;
        public List<Integer> list;
    public RandomizedSet() {
        map= new HashMap<>();
        list= new ArrayList<>();
    }

    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        int n = list.size();
        if(!map.containsKey(val))
            return false;
        int index= map.get(val);
        int last = list.get(n-1);
        list.set(index, last);
        map.put(last, index);
        list.remove(n-1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
            Random rand = new Random();
            return list.get(rand.nextInt(list.size()));
    }
}