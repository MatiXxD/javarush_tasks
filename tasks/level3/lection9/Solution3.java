package tasks.level3.lection9;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if(age > 20) {
            System.out.println("И 18-ти достаточно");
        }

        scanner.close();

    }
}
