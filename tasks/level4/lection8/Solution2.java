package tasks.level4.lection8;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws Exception {

        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();

        for(int i = 0 ; i != m ; ++i){
            for(int j = 0 ; j != n ; ++j){
                System.out.print(8);
            }
            System.out.println("");
        }

        console.close();

    }
}
