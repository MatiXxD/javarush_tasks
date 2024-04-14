package tasks.level4.lection5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        
        while(num > 0) {
            System.out.println(str);
            num--;
        }

    }
}
