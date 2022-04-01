package Javahw;

public class t4_Practice {

    //ternery is just another way of using i else block
    //create a java program that prints max number between 2 numbers

    public static void main(String[]args){

      int number1=10;
      int number2 =20;
      int max=0;// this variable will be used to store max number



      String message="";// this variable will be used for store result as a message

        System.out.println(max);
        System.out.println(message);


        if(number1>number2){//10 >20 false
            max = number1;//java wont run if statement is false
        }else{
            max=number2;//true
        }

message="Maximum number is:"+max;
        System.out.println(message);



        // Ternary(another way of if else block)


        int number3=10;
        int number4=20;
//result=3>4 if 3
        int max2;

        max2=(number3>number4?number3:number4);
        //if present ?
        //present : else

        System.out.println(max2);

        String result="";

        result=(false)?"Java":"Python";
        System.out.println(result);

        if(false){
            result="Java";
        }else{
            result="Python";
        }









    }






























}










