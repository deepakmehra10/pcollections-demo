package com.deepak;

import org.pcollections.HashTreePSet;
import org.pcollections.PSet;

import java.util.Arrays;
import java.util.List;

public class PSetDemo {
    public static void main(String[] args) {
        // Create an empty PSet collection.
        PSet pSet = HashTreePSet.empty();
    
        // Printing empty collection.
        System.out.println(pSet);
        
        List<String> list = Arrays.asList("Vinisha","Vinisha","Deepak","Deepak","Ayush","Ayush");
        
        PSet pSet1 = HashTreePSet.from(list);
        System.out.println(pSet1);
    }
}
