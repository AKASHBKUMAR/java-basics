package com.java.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperation {
    public static void main(String[] args) {
        List<Integer> arrayList = Collections.synchronizedList(new ArrayList());
        arrayList.add(10);
        arrayList.add(20);
        System.out.println(arrayList);

    }
}
