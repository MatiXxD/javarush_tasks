package tasks.level4.lection12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws Exception {
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        
        if ((a <= b && a >= c) || (a >= b && a <= c)) {
            System.out.println(a);
        } else if ((c <= b && c >= a) || (c >= b && c <= a)) {
            System.out.println(c);
        } else {
            System.out.println(b);
        }

    }
}
