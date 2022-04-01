package Javahw;

public class hw3_string {


    public static void main(String[] args) {


        //Valid Triangle
//A triangle is valid if the sum of all the three angles is equal to 180 degrees.
// Write a program that asks the user to enter three integers as angles and
// check whether a triangle is valid or not.

        int angle1 = 90;
        int angle2 = 30;
        int angle3 = 60;


        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("This is a valid triangle.");
        } else {
            System.out.println("This is not a valid triangle");
        }

//
//Telephone Bill
//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for next 50 calls.
//Plus Rs. 0.50 per call for next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.

        int minRs = 200;
        int call = 100;

        double plusRs2 = 200 + (0.60 * call);
        double pluRs3 = 200 + (0.60 * call) + (0.50 * call);
        double plusR4 = 200 + (0.60 * call) + (0.50 * call) + (0.40 * call);

        if (call <= 100) {
            System.out.println(" your monthly bill is " + minRs);
        } else if (call > 100 && call <= 150) {
            System.out.println("your monthly bill is " + plusRs2);
        } else if (call > 150 && call <= 200) {
            System.out.println("your monthly bill is" + pluRs3);
        } else {
            System.out.println("your monthly bill is" + plusR4);
        }


//Grade Calculator
//The marks obtained by a student in 3 different subjects are input by the user.
// Your program should calculate the average of subjects. The student gets a grade as per the following rules:
//Average
//Grade
//
//90-100 A
//80-89  B
//70-79  C
//60-69  D
//0-59  F

        int x = 78, y = 92, z = 88;
        int sum = x + y + z;
        int average = ((x + y + z) / 3);

        if (average <= 100 && average >= 90) {
            System.out.println("Average" + average + "\nGrade" + "A");
        } else if (average <= 89 && average >= 80) {
            System.out.println("Average" + average + "\nGrade" + "B");
        } else if (average <= 79 && average >= 70) {
            System.out.println("Average" + average + " \nGrade" + "C");
        } else if (average <= 69 && average >= 60) {
            System.out.println("Average" + average + "\nGrade" + "D");
        } else {
            System.out.println("Average" + average + "\nGrade" + "F");
        }


//Meaning of Grade
//Write a program that prompts the user to enter grade.
// Your program should display the corresponding meaning of grade as per the following table
//
//Grade  Meaning
//A    Excellent
//
//B    Good
//
//C    Average
//
//D    Deficient
//
//F    Failing

        char grade = 'A';
        char grade1 = 'B';
        char grade2 = 'C';
        char grade3 = 'D';
        char grade4 = 'F';

        char userGrade = 'A';
        String message = "";

        if (userGrade == grade) {
            System.out.println("Excellent");
        } else if (userGrade == grade1) {
            System.out.println("Good");
        } else if (userGrade == grade3) {
            System.out.println("Average");
        } else if (userGrade == grade4) {
            System.out.println("Deficient");
        } else {


//Meaning of Grade
//Write a program that prompts the user to enter grade.
// Your program should display the corresponding meaning of grade as per the following table
//
//Grade  Meaning
//A    Excellent
//
//B    Good
//
//C    Average
//
//D    Deficient
//
//F    Failing


        }
    }
}

















































