package day07_nestedIf;

import java.util.Scanner;

public class c4_scanner {
    public static void main(String[] args) {


// scanner is a library under Java
    //this library has ready methods that you can use
    //to be able to use this library we need to call them in our class
    //and create object from that library

    Scanner input=new Scanner(System.in);
// I called scanner class(ready library under java) and we created an object from scanner class input.
        //from scanner class

// to go to the library hold on to ctrl or command then click on library name
        System.out.println("insert your byte number");
//in scanner if you assign something that is not in range of variable you will have exception

byte b1= input.nextByte();

        System.out.println(b1);

        System.out.println("enter int number");

int number= input.nextInt();
// to be able to use scanner library methods you need to call the object


Scanner scan=new Scanner(System.in);
//this is another object that we created and it omes from the scanner
        //object name is :scan

        short number2= scan.nextShort();
        System.out.println(number2);

















    }


}
