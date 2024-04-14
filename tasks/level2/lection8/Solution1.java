package tasks.level2.lection8;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        String name = console.next();
        int age = console.nextInt();
      
        System.out.println("Через " + age + " лет " + name 
                            + " захватит мир. Му-ха-ха!");

        console.close();
    }
}
