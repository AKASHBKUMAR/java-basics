package com.java.basics;

import java.util.Scanner;

public class StaticBlockHackerrank {
    static int B, H;
    static boolean flag;

    static {
        try {
            Scanner scanner = new Scanner(System.in);
            B = 1;
            H = -3;
            if (B > 0 && H > 0)
                flag = true;
            else
                throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}
