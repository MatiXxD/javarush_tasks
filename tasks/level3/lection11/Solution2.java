package tasks.level3.lection11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(reader.readLine());

        if(val > 0 && val < 1000){
            if(val % 2 == 0){
                System.out.print("четное ");
            } else {
                System.out.print("нечетное ");
            }

            if(val < 10) {
                System.out.print("однозначное число\n");
            } else if(val < 100) {
                System.out.print("двузначное число\n");
            } else {
                System.out.print("трехзначное число\n");
            }
        }

    }
}
