package day07_nestedIf;

public class c3_switchPractice {


    public static void main(String[] args) {

        char letter='A';


        String result="Hello";

        switch (letter) {
            case 'A':

                //result ="Hello A"; no need to reassign we can just add letter a as result
                result += "A";
                break;

            case 'B':
                result += "B"; //hello b

                break;
            case 'C':
                result += "C"; //Hell c

                break;
            default:
                result += "Invalid";
        }
        System.out.println(result);






















    }

















}
