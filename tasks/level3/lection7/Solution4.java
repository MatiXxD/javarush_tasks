package tasks.level3.lection7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());

        if(day == 1) {
            System.out.println("понедельник");
        } else if (day == 2) {
            System.out.println("вторник");
        } else if (day == 3) {
            System.out.println("среда");
        } else if (day == 4) {
            System.out.println("четверг");
        } else if (day == 5) {
            System.out.println("пятница");
        } else if (day == 6) {
            System.out.println("суббота");
        } else if (day == 7) {
            System.out.println("воскресенье");
        } else {
            System.out.println("такого дня недели не существует");
        }

    }
}
