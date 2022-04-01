package day_03;

public class c2_booleanchar {


    public static void main(String[] args) {
        // booleaan 1 byte
        // char 2 bytes



        //datatypes variableName=data;
        boolean b1=true;
        boolean b2= false;
        boolean b3=10>15;//false

        System.out.println(b3);
        System.out.println(b1);

         //char ch1='asasasa';  char will only store single letter or number from acii table
          char ch2='a';
        System.out.println(ch2);

        ///== means equal/ true
        //!= means not equal/false
        boolean bool1=25==30;
        boolean bool2=20!=21;

        System.out.println(bool1);
        System.out.println(bool2);


        //! will change your value as the opposite one
        System.out.println(true==false);
        System.out.println(!true==false);

        System.out.println(!true!=!false);
        // false!=true
        //true result


        System.out.println(!(true==false));
            // (!(false) )
              //(true) cause false with ! equals true

        System.out.println(!(true==true)==(false ==!true));

           //1st part (true)
        // 2nd   false
       // ===( false== false)= true
        // (false)

    char c1='a';
    char c2='2';
    char c3='@';
    //char c4='aa'; error char can only store single characters or acii values
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
// ascii table
        // from ascii table number 97
        int i=97;
        char ch1=97;

        System.out.println(i);// becomes a number
        System.out.println(ch1);//becomes a letter

 int i1=65;
char ch22=65;
char ch23='A';
        System.out.println(i1);
        System.out.println(ch22);

        System.out.println(i1+ch22);// int+char=65+65
     //since we have int as a number and wnted to sum with char
// java  will take ascii number for char






















    }





}



