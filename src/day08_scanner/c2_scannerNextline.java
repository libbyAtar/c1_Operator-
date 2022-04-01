package day08_scanner;

import java.util.Scanner;

public class c2_scannerNextline {

    public static void main(String[] args) {

   // how do i use scanner?
        //to be able to use scanner library
        //we have to create an object from scanner class

        Scanner object=new Scanner(System.in);

        System.out.println("Employee First name");
   String firstname=object.next();
   //next will accept one word
        //doesnt accept enter
        System.out.println("First name is"+firstname);
        //to handle your enter that comes after next use

     object.nextLine();

        System.out.println("Enter fulll name for employee");
        String fullName=object.nextLine();

        System.out.println("Enter Employee age");
        int age=object.nextInt();
        System.out.println("employee age is "+age);


        object.nextLine();// after passing age we also need to handle enter
        System.out.println("Enter Employee City Name");//will accept enter that comes after age
        String cityName=object.nextLine();
        System.out.println("city name is"+cityName);

        System.out.println("Enter salary for employee");
        double salary=object.nextDouble();
        System.out.println("Salary is"+salary);




    }











    }





















