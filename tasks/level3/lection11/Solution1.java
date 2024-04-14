package tasks.level3.lection11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(reader.readLine());
    
        if(val != 0){

            if(val < 0){
                System.out.print("отрицательное ");
            } else if (val > 0) {
                System.out.print("положительное ");
            }

            if(val % 2  != 0) {
                System.out.print("нечетное число\n");
            } else {
                System.out.print("четное число\n");
            }

        } else {
            System.out.println("ноль");
        }
        

    }
}
