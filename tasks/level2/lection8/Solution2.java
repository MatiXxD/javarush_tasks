package tasks.level2.lection8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String val1 = reader.readLine();
        String val2 = reader.readLine();

        System.out.println(name + " получает " + val1 + " через " + val2 + "лет.");

    }
}
