package day07_nestedIf;

import java.util.Scanner;

public class c5_scannerPractice {
    public static void main(String[] args) {


      Scanner userInput=new Scanner(System.in);
      // we just import scanner class to our class
        //we will be able to use all methods from scanner by calling userinput

        System.out.println("Insert first number");
      //  int num1=10;
        //int num2=20;
       // int num3=30;
        //int number1=25;

int number1= userInput.nextInt();
        System.out.println("You have inserted number:"+number1);

        if (number1%2==0){
            System.out.println(number1+"is even number");
        }else{
            System.out.println(number1+"is odd number");
        }















    }














}
