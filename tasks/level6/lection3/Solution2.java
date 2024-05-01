package tasks.level6.lection3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(console.readLine());
        }
        for (int i = numbers.length-1 ; i >= 0 ; --i) {
            System.out.println(numbers[i]);
        }
    }
}
