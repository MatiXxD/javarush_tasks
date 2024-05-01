package tasks.level6.lection5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
    public static char[][] array;

    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(console.readLine());
        array = new char[size][size];

        for(int i = 0 ; i != array.length ; ++i) {
            for(int j = 0 ; j != array[0].length ; ++j) {
                if((i+j) % 2 == 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for(int i = 0 ; i != array.length ; ++i) {
            for(int j = 0 ; j != array[0].length ; ++j) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
