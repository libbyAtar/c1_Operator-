package Code_With_Mosh;

public class new_practice {

    public static void main(String[]args){
// Float             4 bytes          Stores Fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double           8 bytes           Stores fractional numbers. Sufficient for storing 15 decimal digits.
        // Java will pick the double as a default decimal number
        double d1=5.5; // double covers up to 50 decimal digits
        System.out.println(d1);
        double d2= 2.33333333333;
        System.out.println(d2);

        System.out.println(4.5);// Nothing is assigned here so Java will pick Double by Default,
        // So 4.5 in this case is a "Double".

        Float fl=2.5f;// have to let Java know this is float otherwise it will show as an error.

        System.out.println(2+5);// this is number here. Result will be 7
        System.out.println("2+5");// this is text result will be 2+5/ no function

        int i1=6;// If you change the numbers here, it will affect your results.
        int i2=3;// If you change the numbers here, it will affect your results.
        //sum of 2 numbers
        System.out.println(i1+i2);// number plus number is equal to number
        System.out.println(i1-i2);

         double dd1=5.5;
         double dd2=3.5;
         System.out.print(dd1 + dd2);//9.0

// minus operator
        System.out.println(i2-i1);
        System.out.println(d1-d2);



    }









}
