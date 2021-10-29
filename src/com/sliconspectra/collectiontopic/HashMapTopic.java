package com.sliconspectra.collectiontopic;

import java.util.HashMap;

class Key {
    String key;

    @Override
    public boolean equals(Object o) {
        Key k = (Key) o;
        return k.key.equals(this.key);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(key);
    }
}

public class HashMapTopic {
    public static void main(String[] args) {
        HashMap<Key, String> map = new HashMap<>();
        Key key1 = new Key();
        key1.key = "1";
        Key key2 = new Key();
        key2.key = "1";
        map.put(key1, "123");
        map.put(key2, "456");
        map.put(null, "789");
        System.out.println(map.size());
    }
}
