package day04_unaryOperators;

public class c5_logicalOperators {

    public static void main(String[] args) {

        System.out.println((4>2)||(2>4));//false
        System.out.println((10<=5) ||(0==0));//false
        System.out.println((1>=2)||(2!=2));//false
        System.out.println((10>=10)||(10<=10));//true

    //if you are using and operator && only option that you will get true result is all conditions
// true&&
        System.out.println("************");


        System.out.println((4>2)&&(2>4));//false
        System.out.println((10<=5) &&(0==0));//false
        System.out.println((1>=2)&&(2!=2));//false
        System.out.println((10>=10)&&(10<=10));//true

//////
        boolean bool1=true;
        boolean bool2=!(10!=15); //
        System.out.println(bool1&&bool2);

        boolean b3 =!!!!!!bool1;//true
        ///!!!!!! (false)
        //!!!!(true)
        boolean b4= !(15>=15);//!(true)==false

        System.out.println((b3||b4)&&true);
           //(true||false) && true
           // true && true==true

        System.out.println(("Maryam"=="abe")||("murat"=="Murat"));
        //java is case sensitive to be able to have true it has to be an exact match

    }
























}
