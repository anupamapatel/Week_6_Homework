package Week6Homework;
import java.util.Scanner;

public class Ans13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num = sc.nextInt();
        System.out.println("Enter second number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Third number :");
        int num2 = sc.nextInt();

        System.out.println("Average of given Three Number is :"+"\t" + (num + num1 +num2)/3);
    }

}