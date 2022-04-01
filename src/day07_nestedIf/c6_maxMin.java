package day07_nestedIf;

import java.util.Scanner;

public class c6_maxMin {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter First Number");
short num1=scanner.nextShort();
        System.out.println("Enter second Number");
int numb2=scanner.nextInt();
        System.out.println("Enter third number");
int num3=scanner.nextInt();


boolean num1Max=num1>numb2&& num1>num3;
boolean num2Max=numb2>num1&&numb2>num3;
boolean num3Max=num3>num1 && num3>numb2;
int maxNumber=(num1Max)? num1 :(num2Max)? numb2:num3;
        System.out.println(maxNumber);




    }



















}
