package ExtrahomeworkWeek6;
//Write a java program which replace a “I@love@java” to “we love java”
//Expected output: We love java

public class Ans6 {
    public static void main(String[] args) {
   String str = "I@love@java";
   System.out.println(str);

        str = str.replace('@', ' ');
        System.out.println(str);

    }
}
