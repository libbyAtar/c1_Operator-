package day09_stringMethods;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class c4_scanner {

    public static void main(String[] args) {


        String expectedUsername="renastech";
        String expectedPassword="renastech123";

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Username");
        String userInputForUsername=input.nextLine();
        System.out.println("Enter Password");
String userInputForPassword=input.nextLine();


if (userInputForUsername.equals(expectedUsername)&& userInputForPassword.equals(expectedPassword)){
    System.out.println("You have succesefully logged in!!");
}else{
    System.out.println("Login  function has failed");
    System.out.println("invalid credentials please check");
    System.out.println("your credentials"+userInputForUsername+"/"+userInputForPassword);
}


















    }
























}
