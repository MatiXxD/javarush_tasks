package tasks.level6.lection6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
    public static int[][] multiArray;

    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(console.readLine());
        multiArray = new int[n][];

        for(int i = 0 ; i != n ; ++i) {
            int len = Integer.parseInt(console.readLine());
            multiArray[i] = new int[len];
        }
    }
}
