package tasks.level6.lection4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int sumOdd = 0, sumEven = 0;
        int residents[] = new int[15];

        for(int i = 0 ; i != residents.length ; ++i) {
            residents[i] = Integer.parseInt(console.readLine());
            if(i % 2 == 1) {
                sumOdd += residents[i];
            } else {
                sumEven += residents[i];
            }
        }

        if(sumOdd > sumEven) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else if(sumOdd < sumEven) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }

    }
}
