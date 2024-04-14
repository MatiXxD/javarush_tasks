package tasks.level4.lection5;

public class Solution4 {
    public static void main(String[] args) {
        int times = 10;
        while(times != 0){
            int innerTimes = 10;
            while(innerTimes > 0){
                System.out.print("S");
                innerTimes--;
            }
            System.out.println("");
            times--;
        }
    }
}
