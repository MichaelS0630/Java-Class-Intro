package com.company;

public class ControlFlow {
    public static void main(String[] args) {
        String word1 = "goofy";
        String word2 = "ramoneh";
        int number1 = 26;
        //if - if else control slow statements

        if (word1 == word1) {
            System.out.println(word2);
        } else if (word1 == word2) {
            System.out.println("They are equal");
        }
        if (number1 == number1) ;
        {
            number1--;
            System.out.println(number1);
        }
        if (word1.length() <= number1) ;

        Operation doMath = new Operation();
        System.out.println(doMath.add(number1, 4));
        for (int i = 0; i < number1; i++) {
        }
        while (number1 == number1){
            System.out.println("We out");
        }
    }
}