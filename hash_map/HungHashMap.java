package Java.hash_map;

import java.util.LinkedList;

public class HungHashMap<K, V> {
    LinkedList<V>[] data;
    final int INITIAL_SIZE = 15;

    public HungHashMap() {
        data = new LinkedList[INITIAL_SIZE];
    }

    boolean put(K key, V value) {
        int hash_code = key.hashCode();
        int index =  hash_code % INITIAL_SIZE;

        if (data[index] == null) {
            data[index] = new LinkedList<V>();
        }
        
        boolean check = data[index].add(value);
        return check;
    }

    V get(K key) {
        int hash_code = key.hashCode();
        int index =  hash_code % INITIAL_SIZE;

        return data[index].getFirst();
    }
}
