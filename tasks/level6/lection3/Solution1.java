package tasks.level6.lection3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];
        int stringsCount = 8;

        for (int i = 0; i < stringsCount; i++) {
            strings[i] = console.readLine();
        }
        for (int i = strings.length - 1; i >= 0 ; i--) {
            System.out.println(strings[i]);
        }
    }
}
