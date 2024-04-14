package tasks.level3.lection9;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        if(a <= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        console.close();

    }
}
