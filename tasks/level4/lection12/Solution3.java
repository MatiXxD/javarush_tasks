package tasks.level4.lection12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        int val;
        do {
            val = Integer.parseInt(reader.readLine());
            sum += val;
        } while(val != -1);
        
        System.out.println(sum);

    }
}
