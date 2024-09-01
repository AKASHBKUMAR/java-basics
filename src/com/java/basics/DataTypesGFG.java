package com.java.basics;

import java.util.HashMap;

class DataTypesGFGSolution {
    static int dataTypeSize(String string) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Character", 2);
        hashMap.put("Integer", 4);
        hashMap.put("Byte", 1);
        hashMap.put("Short", 2);
        hashMap.put("Long", 8);
        hashMap.put("Float", 4);
        hashMap.put("Double", 8);
        return hashMap.get(string);
    }
}

public class DataTypesGFG {
    public static void main(String[] args) {

        System.out.println(DataTypesGFGSolution.dataTypeSize("Integer"));
    }
}
