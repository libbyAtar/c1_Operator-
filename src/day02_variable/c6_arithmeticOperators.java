package day02_variable;

public class c6_arithmeticOperators {
// Float             4 bytes                 Stores
// double            8 bytes                 Stores

 // as a default java picks

    public static void main(String[]args){

        double d1=5.5;
        System.out.println(d1);
        double d2=2.3333333333;
        System.out.println(d2);

        System.out.println(4.5);//any decimal numbersthat are not deined with variable will be taken as a double

        float fl=2.5f;//java will take a decimal numbers thats why we need to tell compiler this a float

        System.out.println(2+5);//this is number result will be 7
        System.out.println("2+5");//

        int i1=3;
        int i2=5;


        //sum of 2 numbers
        System.out.println(i1+i2);//number+ number= number
        System.out.println(i1-i2);

        double doubled1=5.5;
        double doubled2=3.5;

        System.out.println(doubled1+doubled2);//9.0

        //minus operator
        System.out.println(i2-i1);
        System.out.println(d1-d2);



    }


}
