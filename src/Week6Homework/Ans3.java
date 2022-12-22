package Week6Homework;

public class Ans3 {

    float f = 13.202021f;     //declare instatnce variable
    static char a = '%';       // declare static variable
    void display(){
        Ans3 obj = new Ans3(); //  Creat object
        System.out.println(obj.f);
        System.out.println(obj.a);
    }
    //declare static method
    static void m1(){
        Ans3  abc1 = new Ans3();  //  Creat object
        System.out.println(abc1.a);
        System.out.println(abc1.f);

    }

    public static void main(String[] args) {
        Ans3 abc2 = new Ans3();
        abc2.display();
        m1();
    }

}
