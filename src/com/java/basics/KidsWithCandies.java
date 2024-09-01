package com.java.basics;

import java.util.ArrayList;
import java.util.Arrays;

class KidsWithCandiesSolution {
    ArrayList<Boolean> kidsWithCandiesSolution(int[] candies, int extraCandies) {
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int candy : candies) {
            if ((candy + extraCandies) >= max) {
                arrayList.add(true);
            } else {
                arrayList.add(false);
            }
        }
        return arrayList;
    }
}

public class KidsWithCandies {
    public static void main(String[] args) {
        KidsWithCandiesSolution kidsWithCandiesSolution = new KidsWithCandiesSolution();
        int candies[] = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandiesSolution.kidsWithCandiesSolution(candies, extraCandies));

    }
}
