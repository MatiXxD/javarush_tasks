package tasks.level3.lection5;

public class Solution1 {
    private String name = "безымянный кот";

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Solution1 cat = new Solution1();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
