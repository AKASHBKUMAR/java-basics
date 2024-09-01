package com.java.basics;

import java.util.ArrayList;

class TargetArrayInGivenOrderSolution {
    int[] targetArrayInGivenOrderSolution(int[] nums, int[] index) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int indexIterator = 0, arrayIterator = 0; indexIterator < index.length && arrayIterator < nums.length; indexIterator++, arrayIterator++) {
            arrayList.add(index[indexIterator], nums[arrayIterator]);
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {1};
        int index[] = {0};
        TargetArrayInGivenOrderSolution targetArrayInGivenOrderSolution = new TargetArrayInGivenOrderSolution();
        int[] result = targetArrayInGivenOrderSolution.targetArrayInGivenOrderSolution(nums, index);
        for (int i : result)
            System.out.println(i);
    }
}

