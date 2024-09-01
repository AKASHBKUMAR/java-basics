package com.java.basics;

class ShuffleTheArraySolution {
    int[] shuffle(int[] nums, int n) {
        int numsArrayLength = nums.length;
        int arr[] = new int[numsArrayLength];
        for (int iterator = 0; iterator < numsArrayLength; iterator += 2) {
            arr[iterator] = nums[iterator / 2];
            arr[iterator + 1] = nums[iterator + n];
            n--;
        }
        return arr;

    }
}

public class ShuffleTheArray {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 3, 4, 7};
        int n = 3;

        ShuffleTheArraySolution shuffleTheArraySolution = new ShuffleTheArraySolution();
        int[] result = shuffleTheArraySolution.shuffle(arr, n);


    }
}
