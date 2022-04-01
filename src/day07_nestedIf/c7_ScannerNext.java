package day07_nestedIf;

import java.util.Scanner;

public class c7_ScannerNext {


    public static void main(String[] args) {

//2 way to create string scanner
        //next and nextline

        Scanner input=new Scanner(System.in);
        System.out.println("Enter thr first name");
// firstname libby
        String firstName=input.next();
        System.out.println("First name is :" + firstName);
        System.out.println("Enter Last name");
        String lastName=input.next();
        System.out.println("Last name is "+lastName);

      String fullName=firstName+""+lastName;

        System.out.println(fullName);
        System.out.println("Grade for student ");
int grade =input.nextInt();

        System.out.println(fullName+"grade is"+grade);









    }



























}
