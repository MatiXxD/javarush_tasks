package tasks.level4.lection8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String name = console.readLine();

        for(int i = 0 ; i != 10 ; ++i){
            System.out.println(name + " любит меня.");
        }

    }
}
