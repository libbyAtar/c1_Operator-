package day04_unaryOperators;

public class c2_task {

    public static void main(String[] args) {

        // create 3 different number
        //second number should be first number+7
        //third number should be= second number+8
        //ex: x=25, y=32/z=40
        //ex : x=20/y=27 z=35


        int x=20;
        int y=x+7;// Y=27
        int z=y+8;// z=27+8=35

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

// Sun of those 3 number
//if x is divisble by 2,3,5

        //x=20
        //this is divisible by 2
       // System.out.println("x is divisible by 2 true");

boolean divisibleBy2forX=x% 2 ==0;// if reminder is equal to 0 that means number is divisible by 2


        System.out.println(x+"is divisible by 2 true");
        boolean divisibleBy3forX= x%3==0;//25%3==1 false
        System.out.println(x+"is divisble by 3"+divisibleBy3forX);










    }










}
