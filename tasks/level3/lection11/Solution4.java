package tasks.level3.lection11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int count_pos = 0;
        int count_neg = 0;

        if(a > 0) count_pos++;
        else if(a < 0) count_neg++;
        if(b > 0) count_pos++;
        else if(b < 0) count_neg++;
        if(c > 0) count_pos++;
        else if(c < 0) count_neg++;

        System.out.println("количество отрицательных чисел: " + count_neg);
        System.out.println("количество положительных чисел: " + count_pos);

    }
}
