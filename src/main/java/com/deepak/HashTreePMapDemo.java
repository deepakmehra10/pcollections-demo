package com.deepak;

import org.pcollections.HashTreePMap;
import org.pcollections.PMap;

import java.util.HashMap;
import java.util.Map;

public class HashTreePMapDemo {
    public static void main(String[] args) {
        // Create an empty PMap.
        PMap pMap = HashTreePMap.empty();
    
        // Printing empty Map.
        System.out.println(pMap);
    
        // Create a Map with existing map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Deepak");
        map.put(2, "Deeps");
    
        PMap pMap1 = HashTreePMap.from(map);
        System.out.println(pMap1);
    
        // Create a PMap with single item
        PMap<String, String> pMap2 = HashTreePMap.singleton("1", "Deepak");
        System.out.println(pMap2);
    
        // Add a key,value pair to the PMap
        PMap<String, String> plus = pMap2.plus("2", "Deeps");
    
        System.out.println(plus);
    
    }
}