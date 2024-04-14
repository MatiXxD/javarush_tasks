package tasks.level3.lection7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if (num > 0) {
            num *= 2;
        } else if (num < 0) {
            num++;
        } 

        System.out.print(num);

    }
}
