package Practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Practice_8 {

    public static void main(String[] args) {

        ///Variables for Mark and John

        // variables for Mark
        double MarkW = 80;
        double MarkH = 1.69;


        //Bmi =mass/(height*height)
        double markBmi = MarkW / (MarkH * MarkH);

        //variables for john

        double JohnW = 92;


        double JohnH = 1.95;

        double JohnBmi = JohnW / (JohnH * JohnH);

        if (markBmi > JohnBmi) {
            System.out.println("Mark has higherBmi");
            System.out.println("MarkBmi" + markBmi);
        }else{
            System.out.println("Mark and JOhn have same Bmi");
            System.out.println("markBmi"+markBmi);
            System.out.println("johnBmi"+JohnBmi);
        }

































    }

}