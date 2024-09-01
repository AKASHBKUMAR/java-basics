package com.java.basics;

class Patterns {
    static void squarePattern() {
        for (int outerIterator = 0; outerIterator < 4; outerIterator++) {
            for (int innerIterator = 0; innerIterator < 4; innerIterator++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void trianglePattern() {
        for (int outerIterator = 0; outerIterator < 5; outerIterator++) {
            for (int innerIterator = 0; innerIterator <= outerIterator; innerIterator++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void numberPattern() {
        for (int outerIterator = 1; outerIterator <= 5; outerIterator++) {
            for (int innerIterator = 1; innerIterator <= outerIterator; innerIterator++) {
                System.out.print(innerIterator + " ");
            }
            System.out.println();
        }
    }

    static void triangleRowPattern() {
        for (int outerIterator = 1; outerIterator <= 5; outerIterator++) {
            for (int innerIterator = 1; innerIterator <= outerIterator; innerIterator++) {
                System.out.print(outerIterator + " ");
            }
            System.out.println();
        }
    }

    static void invertedTriangle() {
        for (int outerIterator = 5; outerIterator >= 1; outerIterator--) {
            for (int innerIterator = 1; innerIterator <= outerIterator; innerIterator++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedTriangleNumberPattern() {
        for (int outerIterator = 5; outerIterator >= 1; outerIterator--) {
            for (int innerIterator = 0; innerIterator < outerIterator; innerIterator++) {
                System.out.print((innerIterator + 1) + " ");
            }
            System.out.println();
        }
    }

    static void equilateralTrianglePattern() {
        for (int outerIterator = 0; outerIterator < 5; outerIterator++) {
            //space
            for (int firstSpaceIterator = 0; firstSpaceIterator < 5 - outerIterator - 1; firstSpaceIterator++) {
                System.out.print(" ");
            }
            //star
            for (int innerIterator = 0; innerIterator < outerIterator * 2 + 1; innerIterator++) {
                System.out.print("* ");
            }
            //space
            for (int secondSpaceIterator = 0; secondSpaceIterator < 5 - outerIterator - 1; secondSpaceIterator++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void invertedEquilateralTriangle() {
        for (int rowIterator = 5; rowIterator >= 1; rowIterator--) {
            //space
            for (int columnIteratorSpace = 0; columnIteratorSpace < 5 - rowIterator; columnIteratorSpace++) {
                System.out.print(" ");
            }
            //star
            for (int columnIteratorStar = 0; columnIteratorStar < 2 * rowIterator - 1; columnIteratorStar++) {
                System.out.print("* ");
            }
            //space
            for (int columnIteratorSpace = 0; columnIteratorSpace < 5 - rowIterator; columnIteratorSpace++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void symmetryPattern() {
        int N = 5;
        for (int rowIterator = 1; rowIterator <= 2 * N - 1; rowIterator++) {
            int stars;
            if (rowIterator > N) {
                stars = 2 * N - rowIterator;
            } else {
                stars = rowIterator;
            }
            for (int columnIterator = 1; columnIterator <= stars; columnIterator++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangle01Pattern() {
        for (int rowIterator = 0; rowIterator < 5; rowIterator++) {
            int start;
            if (rowIterator % 2 == 0) start = 1;
            else start = 0;
            for (int columnIterator = 0; columnIterator <= rowIterator; columnIterator++) {
                System.out.print((start + columnIterator) % 2 + " ");
            }
            System.out.println();
        }
    }

    static void patternV() {
        int N = 4;
        int spaceNumber = 2 * (N - 1);
        for (int rowIterator = 1; rowIterator <= N; rowIterator++) {
            //number
            for (int columnIterator = 1; columnIterator <= rowIterator; columnIterator++) {
                System.out.print(columnIterator);
            }
            //space
            for (int spaceIterator = 0; spaceIterator < spaceNumber; spaceIterator++) {
                System.out.print(" ");
            }
            //number
            for (int columnIterator = rowIterator; columnIterator >= 1; columnIterator--) {
                System.out.print(columnIterator);
            }
            spaceNumber -= 2;
            System.out.println();
        }
    }

    static void numberIncrementPattern() {
        int number = 1;
        for (int rowIterator = 0; rowIterator < 5; rowIterator++) {
            for (int columnIterator = 0; columnIterator <= rowIterator; columnIterator++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    static void triangleABPattern() {
        for (int rowIterator = 0; rowIterator < 5; rowIterator++) {
            for (char columnIterator = 'A'; columnIterator <= 'A' + rowIterator; columnIterator++) {
                System.out.print(columnIterator + " ");
            }
            System.out.println();
        }
    }

    static void invertedTriangleABPattern() {
        for (int rowIterator = 5; rowIterator >= 1; rowIterator--) {
            for (char columnIterator = 'A'; columnIterator < 'A' + rowIterator; columnIterator++) {
                System.out.print(columnIterator + " ");
            }
            System.out.println();
        }
    }

    static void rowTriangle() {
        for (int rowIterator = 0; rowIterator < 5; rowIterator++) {
            char ch = (char) ('A' + rowIterator);
            for (int columnIterator = 0; columnIterator <= rowIterator; columnIterator++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void equilateralTriangleABPattern() {
        int N = 5;
        for (int rowIterator = 0; rowIterator < N; rowIterator++) {
            char startCharacter = 'A';
            //space
            for (int columnIterator = 0; columnIterator < N - rowIterator - 1; columnIterator++) {
                System.out.print(" ");
            }
            //character
            for (int characterIterator = 0; characterIterator < 2 * rowIterator + 1; characterIterator++) {
                System.out.print(startCharacter + " ");
                if (characterIterator < rowIterator)
                    startCharacter += 1;
                else
                    startCharacter -= 1;
            }
            //space
            for (int columnIterator = 0; columnIterator < N - rowIterator - 1; columnIterator++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void reverseCharacterTrianglePattern() {
        int N = 5;
        for (int rowIterator = 0; rowIterator < 5; rowIterator++) {
            for (char columnIterator = (char) ('E' - rowIterator); columnIterator <= 'E'; columnIterator++) {
                System.out.print(columnIterator + " ");
            }
            System.out.println();
        }
    }

    static void spacePyramidPattern() {
        int N = 5;
        for (int rowIterator = 0; rowIterator < N; rowIterator++) {
            //star
            for (int starIterator = 0; starIterator < N - rowIterator; starIterator++) {
                System.out.print("*");
            }
            //space
            for (int spaceIterator = 0; spaceIterator < 2 * rowIterator; spaceIterator++) {
                System.out.print(" ");
            }
            //star
            for (int starIterator = 0; starIterator < N - rowIterator; starIterator++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int lowerRowIterator = 0; lowerRowIterator < N; lowerRowIterator++) {
            for (int starIterator = 0; starIterator <= lowerRowIterator; starIterator++) {
                System.out.print("*");
            }
            for (int spaceIterator = 0; spaceIterator < 2 * (N - lowerRowIterator - 1); spaceIterator++) {
                System.out.print(" ");
            }
            for (int starIterator = 0; starIterator <= lowerRowIterator; starIterator++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void columnSymmetryMatrix() {
        int N = 5;
        int spaces = 2 * N - 2;
        for (int rowIterator = 1; rowIterator <= 2 * N - 1; rowIterator++) {
            int stars = rowIterator;
            if (rowIterator > N) {
                stars = ((2 * N) - rowIterator);
            }
            for (int starIterator = 1; starIterator <= stars; starIterator++) {
                System.out.print("*");
            }
            //space
            for (int spaceIterator = 1; spaceIterator <= spaces; spaceIterator++) {
                System.out.print(" ");
            }
            for (int starIterator = 1; starIterator <= stars; starIterator++) {
                System.out.print("*");
            }
            System.out.println();
            if (rowIterator >= N) {
                spaces += 2;
            } else {
                spaces -= 2;
            }
        }
    }

    static void hollowSquarePattern() {
        int N = 10;
        for (int rowsIterator = 0; rowsIterator < N; rowsIterator++) {
            for (int columnIterator = 0; columnIterator < N; columnIterator++) {
                if (rowsIterator == 0 || rowsIterator == N - 1 || columnIterator == 0 || columnIterator == N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class SquarePatterns {
    public static void main(String[] args) {
        Patterns.hollowSquarePattern();


    }
}
