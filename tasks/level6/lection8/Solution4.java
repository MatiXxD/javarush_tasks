package tasks.level6.lection8;

import java.util.Arrays;

public class Solution4 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 10;

    public static void main(String[] args) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);

        if (Arrays.binarySearch(sorted, element) >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
