package day06_i_ternary_nestedif;

public class c1_multiifStatement {

    public static void main(String[] args) {


//shortcut o main method : main+enter

        // Starting point is 0  print you are at
        // ending point is 10
        //between those numbers (0-10) will be on my way
        // anything left will be wrong way

      // int to store a number
        //multi of statements


int point=200;

   if(point==0){ // this is only one example of if
       System.out.println("You are at starting point");

   }else if(point>0 && point<10){
       System.out.println("you are on your way");
} else if(point==10){
       System.out.println("You are at ending point");

   }else {
       System.out.println("you are on wrong way");
       System.out.println("Please check your point");
       System.out.println("Point has to be between 0-10!!!!!");
   }





    }








}
