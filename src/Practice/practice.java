package Practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class practice {

   public static void main(String[] args) {

/*
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter First Word");
      String input1= scanner.nextLine();
      System.out.println("Enter Second Word");
      String input2=scanner.nextLine();


      String newInput=input1 + input2;
      System.out.println(newInput);

*/
/*
 task 6. write a program that can return the factorial number of any given number
      Ex:
        input: 6
        output: 720
      because:
        6! = 6 * 5 * 4 * 3 * 2* 1 = 120
        15!= 15 * 14 *.....* 1
*/
//Task 1:
//  Write a Java program to display the middle character of a string in uppercase
//    --> If the length of the string is even number String will have two middle characters.
//    --> If the length of the string is odd number String will have one middle character.
//
//  example :
//        Input 1 : World       Output 1:Middle character is: R
//        Input 2 : computer     Output 2:Middle character is: PU
//        .....

      Scanner scan1 =new Scanner (System.in);
      System.out.println("Enter Word");
String country =scan1.nextLine();

int middleLetter=country.length()/2;

if (country.length()%2 !=0){
   System.out.println("My mom's country is :"+country.charAt(country.length()/2));

}else{
   System.out.println(""+country.charAt((country.length()/2)-1)+country.charAt((country.length()/2)));
}

//Question 6
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
//For example, if the input is 12345, the output should be 54321.




















   }

}


































//  task 6. write a program that can return the factorial number of any given number
//   Ex:
// input: 6
// output: 720
// because:
//       6! = 6 * 5 * 4 * 3 * 2* 1 = 120
//     15!= 15 * 14 *.....* 1
/*
   Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number :");
   int value = scanner.nextInt();

   int factorial = 1;

    for (int i=1; i<=value;i++){

      factorial = factorial*=i;
   }

    System.out.println("Factorial number is "+factorial);
}*/
//
// - Ask user to enter two words. Then add them together and print. But if the last letter of the first word and the first letter of the last letter is the same, print that character once.
//          Input:
//            one
//            eight
//          Output:
//            oneight






