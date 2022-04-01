package Week4_Day1;

import java.util.Scanner;

public class task2 {






//Task 2: Create a java program that will check given string and
//  if string starts or ends with 'a' or 'A' remove it from string.
//  if it is not leave it as it is :
//  examples :
//  if string is Hello output should be Hello
//  if string is JavA output should be jav
//  if string is Ajavaa output should be jav
//  .....
//  Hint : Try with different cases to make sure your code is working correctly .
//  if you want to try with multiple words to you can create scanner and try multiple times with different words


    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter word:");
        String word= input.nextLine();
        System.out.println("Entered word:  "+word);


        if (word.startsWith("A")|| word.startsWith("a")) {
            word = (word.substring(1));
        }
        int last=word.length()-1;
        if (word.substring(last).equalsIgnoreCase("A")){
            word=(word.substring(0,last));
        }
        System.out.println("Another word"+word);


























    }








































}
