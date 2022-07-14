// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;

class Solution {

    public int solution(int[] A) {

        int smallest = 1;

        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {

            if (A[i] == smallest) {

                smallest++;
            }
        }

        return smallest;
    }
}