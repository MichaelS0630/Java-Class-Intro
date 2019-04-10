package com.company;

public class Operation {
    //This is the operation class used to perform various operations

    //Add method helps us to add numbers; a = first number b = second number


    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b){
            return a - b;
    }
    public int divide(int a, int b) {
        return a/b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int increment(int a){
        return a++;
    }
    public int decrement(int a){
        return a--;
    }
    public int modulous(int a, int b){
        return a%b;
    }
    public int multAdd (int a, int b, int c) {
        int sum = a + b;
        return sum + c;
    }
        public String message(String a){
            String mesg ="what ever you want to say to the person using ";
                    return a + mesg;


        }
}