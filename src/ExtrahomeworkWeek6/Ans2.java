package ExtrahomeworkWeek6;
//Write a java program which remove extra space from both side “    I love java    ”
//Expected output: “I love java”

public class Ans2 {
    public static void main(String[] args){
    String str = "     I Love Java    ";
    String str1 = str.replaceAll("\\s",  "");
    System.out.println(str1);
    }
}
