package Javahw;

import javax.crypto.spec.PSource;

public class t1_Java {

    public static void main(String[] args) {

        //task 1: create a java program that will check if number is divisible by 2 and 5 same time
//task 2: write java program to find the largest among three numbers. 1) Using if-else..if
//task 3: create Program to check whether the given number is positive or negative
//  → If a number is greater than zero then it is a positive number
//      → If a number is less than zero then it is a negative number
//      → If a number is equal to zero then it is neither negative nor positive.

// Task 1
        int number1=10;
        int number2=27;

        System.out.println("Is 10 divisible by 5? \nIt is divisible by 5"+(number1%5));
        System.out.println("Is 10 divisible by 2?\n10 is divisible by 2"+(number1%2));


        String message= "Is 27 divisible by 2?";
        String message2="Is 27 divisible by 5?";
        System.out.println(number2%5);
        System.out.println(number2%2);

     //task2

     byte n1=100;
     byte n2=90;
     byte n3=68;

     String message1=("Is n1>=n2 ?");
     String message3= ("Is n1<=n2?");
     if (n1>=n2){
        System.out.println(n1+"Is greater than"+n2);
}
   if(n2>=n3){
       System.out.println(n2+"Is greater than"+n3);
}

if (n1!=n2){
    System.out.println(n1+"Is not equal to"+n2);
} else {
        System.out.println(n1+ "NotEqual" + n2);
        }
//task3
byte t1=-5;
byte t2=7;


String message4 =("is t1 negative?\nOr is it positive?");
String message5=("is t2 positive ? \nOr is it negative?");

if(t1<=0){
    System.out.println(t1<=0);
}
if (t2>=0);
    System.out.println(t2>0);
}

///










}










