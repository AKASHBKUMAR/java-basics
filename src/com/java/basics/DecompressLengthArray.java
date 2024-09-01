package com.java.basics;

import java.util.ArrayList;
import java.util.Arrays;

class DecompressLengthArraySolution {
    int[] decompressLengthArraySolution(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int iterator = 0; iterator < nums.length; iterator += 2) {
            int frequency = nums[iterator];
            int frequencyArray[] = new int[frequency];
            Arrays.fill(frequencyArray, nums[iterator + 1]);
            for (int i : frequencyArray) {
                arrayList.add(i);
            }
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }

    int[] decompressLengthArraySolutionOptimized(int[] nums) {
        int lengthOfFrequencyArray = Integer.MIN_VALUE;
        for (int iterator = 0; iterator < nums.length; iterator += 2) {
            lengthOfFrequencyArray += nums[iterator];
        }
        int arr[] = new int[lengthOfFrequencyArray];
        for (int iterator = 0; iterator < nums.length; iterator += 2) {
            Arrays.fill(arr, nums[iterator + 1], nums[iterator], nums[iterator + 1]);
        }
        return arr;
    }
}

public class DecompressLengthArray {
    public static void main(String[] args) {
        DecompressLengthArraySolution decompressLengthArraySolution = new DecompressLengthArraySolution();
        int[] result = decompressLengthArraySolution.decompressLengthArraySolutionOptimized(new int[]{1, 1, 2, 3});
        for (int i : result) {
            System.out.println(i);
        }

    }
}
