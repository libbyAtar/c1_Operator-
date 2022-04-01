package Practice;

import javax.sound.midi.Soundbank;

public class m1_Task {

    public static void main(String[] args) {
        //Task 1- Buying Liquor.

       // 1- Ask the user to enter his/her birth year (example: 1997, 1980, 1890);
      //  2-  Calculate user's age as a new variable
   //     3-if the user is 21 or older print You can buy liquor.
     //   4-If user is younger than 21,
               // Print you can't buy liquor no, but you can buy (21-userAge) year later.  (Example user is 18 years old, it should say "you can't buy liquor no, but you can buy 3yearsr later")

               int Dateofbirth=2005;
               int now=2022;
               int age=now-Dateofbirth;
               System.out.println(age);
               int legalageofbuying=21;


               if(age>legalageofbuying){
                   System.out.println("you can liquor");
               } else {
                   System.out.println("You cant buy liquor now,but you can buy "+(legalageofbuying-age)+"years later");
               }

        // Task -BMI

   //    Mark and John are trying to compare their BMI (Body Mass Index), which is calculated using the formula:
   //     BMI = mass / (height * height) (mass in kg and height in meter).

     //   Test data:
///** Data 1: Marks weighs 78 kg and is 1.69 m tall. John weighs 92 kg and is 1.95 m tall.

      //  Requirements:
       // 1- Create variables for Mark and John.
     //   2- Calculate Mark's and Jonh's BMI as a variable
      //  3- Print who has more BMS using if-else statement
      //  4- Repeat same steps for new data (New data sample is in Below)

             //   **Data 2: Marks weighs 95 kg and is 1.88 m tall. John weighs 85 kg and is 1.76 m tall.


     int MarkM =78;
     int JohnM=92;
     double MarkH=1.69;
     double JohnH=1.95;

     double Bmi=MarkM/(MarkH*MarkH);
     double Bmi2=JohnM/(JohnH*JohnH);

     if (Bmi>Bmi2){
         System.out.println(Bmi);
     }else {
         System.out.println(Bmi2);}

       MarkM=95;
      JohnM=85;

    MarkH=1.88;
     JohnH=1.76;

     Bmi=MarkM/(MarkH*MarkH);
    Bmi2=JohnM/(JohnH*JohnH);

        if (Bmi>Bmi2){
            System.out.println(Bmi);}
    else {
        System.out.println(Bmi2);}






 }







}
