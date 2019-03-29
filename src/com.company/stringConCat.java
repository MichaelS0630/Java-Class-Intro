package com.company;

import java.util.Scanner;

public class stringConCat {
    public static void main(String[] args){
        System.out.println("Enter The Word You Want To Change");
        String userInput = new Scanner(System.in).next();
        String name = "skadoosh";
        String newWord;
        newWord = userInput.concat(name.substring(0,3));
        String bread = name.substring(3);
    System.out.println(bread + newWord );
}}

