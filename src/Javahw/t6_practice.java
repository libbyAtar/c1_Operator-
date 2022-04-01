package Javahw;

import java.util.Scanner;

public class t6_practice {

    public static void main(String[] args) {

        // weather
        // user will enter the temp
// over 30 degrees is hot
        //between 10 30 it  is nice
        //below 10 it is cold
        Scanner userInput=new Scanner(System.in);
        System.out.println("enter the temp");

        int aa=-50;
        System.out.println(Math.abs(aa));//absolute value





        int temp=userInput.nextInt();

      if(temp>30);{
       System.out.println("It is hot");}
      if (temp > 10 && temp < 30) {
                System.out.println("It is nice");}
   else if (temp<10){
            System.out.println("it is cold");
            }
   else{
            System.out.println("enter valid number");
    }















    }

















}
