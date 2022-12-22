package Week6Homework;

import jdk.internal.dynalink.beans.StaticClass;

// declare instatnce variable
public class Ans4 {
    String abc1 = "what is your name";
    String a = "Anupama Patel";

    static String abc2 = "Anupama Patel";    //declare static variable
    static boolean abc3 = false;

    void display(){
        Ans4 obj = new Ans4();             //Declare instatnce method
        System.out.println(obj.abc1);
        System.out.println(obj.a);
        System.out.println(obj.abc2);
        System.out.println(obj.abc3);
    }
    // declare static method
    static void m1(){
        Ans4 a1 = new Ans4();
        System.out.println(a1.abc1);
        System.out.println(a1.a);
        System.out.println(a1.abc2);
        System.out.println(a1.abc3);

    }
    //main method
    public static void main(String[] args) {
        Ans4 a2 = new Ans4();    // create object
        a2.display();    //instatnce method using object name
        m1();        //static directly
    }




}
