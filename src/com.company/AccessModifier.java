package com.company;

public class AccessModifier {

    public static void main(String[] args) {
        //calling all methods
        saySomethingNice();
        secretWord();
        DefaultExample obj = new DefaultExample();
        obj.example();
    }


    public static void saySomethingNice() {
        String ramone = "hello Mike";
        System.out.println("ramone");
    }
    public static void secretWord(){
        String arcade = "Hello Game";
        String a = arcade.substring(4,8);
        String b = arcade.substring(7,9);
        String c = b + arcade + a;
        System.out.println(c);

    }
}

