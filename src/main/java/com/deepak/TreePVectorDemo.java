package com.deepak;

import org.pcollections.PVector;
import org.pcollections.TreePVector;

import java.util.Arrays;
import java.util.List;

public class TreePVectorDemo {
    public static void main(String[] args) {
        // Create an empty PVector collection.
        PVector pVector = TreePVector.empty();
        
        // Printing empty collection.
        System.out.println(pVector);
        
        // Create PVector with single element
        PVector pVector2 = TreePVector.singleton("Deeps");
        System.out.println(pVector2);
        
        List<String> students = Arrays.asList("Deepak", "Bhawna", "Charmy", "Vinisha");
        // Create a PVector collection.
        PVector pVector1 = TreePVector.from(students);
        PVector<String> rahul = pVector1.plus("Rahul");
        
        System.out.println(pVector1);
        System.out.println(rahul);
        
        //plus-all
        PVector<String> plusAll = pVector1.plusAll(rahul);
        System.out.println(plusAll);
        
        //minus
        PVector<String> minus = pVector1.minus("Charmy");
        System.out.println(minus);
        
        //minus-all
        PVector<String> minusAll = plusAll.minusAll(students);
        System.out.println(minusAll);
    }
}
