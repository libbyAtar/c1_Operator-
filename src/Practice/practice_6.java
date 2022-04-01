package Practice;

public class practice_6 {

    public static void main(String[] args) {

   //boolean
        //char
        boolean libby1=true;
        boolean libby2=false;
        boolean libby3=10>15;//false

        System.out.println(libby3);
        System.out.println(libby1);

        char ch1='a';// single character
        char ch2='b';
        System.out.println(ch2);

        boolean bool1= 25==30; //==means equal // this is a false condition
                                //!=means not equal
        boolean bool2=20!=21;//true

        System.out.println(bool1);
        System.out.println(bool2);
        //! will change the value to the opposite one
        //!true=false
        //!false=true
        System.out.println(true==false);//false
        System.out.println(!true==false);//false==false=true

        System.out.println(!true!=!false);//false
        /// opposite of true is false
        // opposite of false is true


        System.out.println(!(true==false));//true
        // there is a (!(false))
        //(true)

        System.out.println(!(true==true)==(false==!true));//false
                            // here true     // here false
                                  // then it would be true and false and therefore true
                          //false

          char c1='a';
          char c2='2';
           char c3='@';
           char c4='#';
           /// char can only store single characters or ascii values
        System.out.println(ch1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

       int i =97;
       char halil1=97;
        System.out.println(i);
        System.out.println(ch1);

        int i1=65;
        char ch22=65;
        char ch23='A';

        System.out.println(i1);
        System.out.println(ch22);
        System.out.println(ch23);

        System.out.println(i1+ch22); // int + char=? 65+65
        //since we have int as a number and wanted to sum with char
        //java will take ascii (value) number for char




    }





}
