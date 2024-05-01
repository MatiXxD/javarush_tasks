package tasks.level6.lection4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int bigArray[] = new int[20];
        for(int i = 0 ; i != bigArray.length ; ++i) {
            bigArray[i] = Integer.parseInt(console.readLine());
        }

        int smallArray1[] = new int[10];
        int smallArray2[] = new int[10];
        for (int i = 0; i < smallArray1.length; i++) {
            smallArray1[i] = bigArray[i];
            smallArray2[i] = bigArray[smallArray1.length+i];
        }

        for (int number : smallArray2) {
            System.out.println(number);
        }
    }
}
