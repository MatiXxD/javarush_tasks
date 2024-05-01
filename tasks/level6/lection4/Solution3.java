package tasks.level6.lection4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String strings[] = new String[10];
        int lengths[] = new int[10];

        for(int i = 0 ; i != strings.length ; ++i) {
            strings[i] = console.readLine();
            lengths[i] = strings[i].length();
        }

        for(int len : lengths) {
            System.out.println(len);
        }
    }
}
