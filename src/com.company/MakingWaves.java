package com.company;

public class MakingWaves {
    public static void main(String[] args) {
        Operation whiteWash = new Operation();
        System.out.println(whiteWash.add(40,70));
        System.out.println(whiteWash.multiply(2,9));
        System.out.println(whiteWash.divide(20,4));
        System.out.println(whiteWash.subtract(10,20));
        System.out.println
                (whiteWash.add(
                whiteWash.subtract(10,10)
                        ,1));
        System.out.println(whiteWash.multAdd(1,2,3));
        whiteWash.message("Michael");
        }


    }

