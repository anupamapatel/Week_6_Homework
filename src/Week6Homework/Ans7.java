package Week6Homework;
import java.util.Scanner;

public class Ans7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);

        double fahrenheit;
        double celsius;

        System.out.println("Enter the degree's fahrenheit :");

        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit-32)*5.0/9.0;
        System.out.println(" the Equivalent of celsius : ");
        System.out.println(celsius);
    }
}
