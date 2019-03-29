
        //This will be a helpful tool for learning strings
    /*
    Add any other helpful information here

    word.charAt("enter a number here"); returns char at number
    word.conCat("enter a word"); adds a word to the end
    word.equalist("enter a word") compares 2 Strings
    word.toUppercase("enter a word") makes word all CAPS
    word.toLowercase("enter a word") makes word all lowercase
    Shortcuts
        sout "enter" =  System.out.println();
        psvm "enter" =  public static void main(String[] args) {

     */

package com.company;

import java.util.Scanner;

public class StringExamples {

    public static void main(String[] args) {
        System.out.println("Enter A 5 Letter Word Here PLease Or Die");
        String example = new Scanner(System.in).next();
        System.out.println(example.charAt(example.length()/2));
        System.out.println(example.equals(example));
        System.out.println(example.concat(example));
        System.out.println(example.toUpperCase());
        System.out.println(example.toLowerCase());






    }
}










