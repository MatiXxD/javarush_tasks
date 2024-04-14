package tasks.level3.lection11;

import java.util.Scanner;

public class Solution3 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        int count = 0;
        if(a > 0) count++;
        if(b > 0) count++;
        if(c > 0) count++;

        System.out.println(count);

        console.close();

    }

}
