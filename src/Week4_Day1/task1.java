package Week4_Day1;

public class task1 {


    public static void main(String[] args) {


        String sentence = "hello my name is hello worlD. i am 25 years old. i am living in new york. i have been in the IT industry for about 6 years. i starteD as a manual tester and now doing AutO for about 4 years.i have experiance in different DOmains :education,Energy,finance.i have Srum Master and Oracle Java Programmer certificates.my main lanGuage is Java. i designed and deveLoped many automation test scripts by using BDD framework";
        String Str1 ="hello my name is hello worLD";
        String str2=" i am 25 years old. i am living in new york.";
        String Str3="i am living in new york.";
        String str4=" i have been in the IT industry for about 6 years.";
        String Str5= "i starteD as a manual tester and now doing AutO for about 4 years.";
        String Str6="i have experiance in different DOmains :education,Energy,finance.";
        String Str7="i have Srum Master and Oracle Java Programmer certificates.my main lanGuage is Java.";
        String Str8 ="i designed and deveLoped many automation test scripts by using BDD framework.";

        System.out.println(Str1.substring(0,1).toUpperCase().concat(Str1.substring(1).toLowerCase()).trim());
        System.out.println(str2.trim().substring(0,1).toUpperCase().concat(str2.substring(4).toLowerCase()).trim());
        System.out.println(Str3.trim().substring(0,1).toUpperCase().concat(Str3.substring(4).toLowerCase()).trim());
        System.out.println(str4.trim().substring(0,1).toUpperCase().concat(str4.substring(4).toLowerCase()).trim());
        System.out.println(Str5.trim().substring(0,1).toUpperCase().concat(Str5.substring(4).toLowerCase()).trim());
        System.out.println(Str6.trim().substring(0,1).toUpperCase().concat(Str6.substring(4).toLowerCase()).trim());
        System.out.println(Str7.trim().substring(0,1).toUpperCase().concat(Str7.substring(4).toLowerCase()).trim());
        System.out.println(Str8.trim().substring(0,1).toUpperCase().concat(Str8.substring(4).toLowerCase()).trim());

        System.out.println("Length of sentence       : "+Str1.length()+""+str2.length()+""+ Str3.length()+""+str4.length()+""+ Str5.length()+""+Str6.length()+""+ Str7.length()+ Str8.length()+"");
        System.out.println("last index of each sentence :   " +Str1.lastIndexOf("")+str2.lastIndexOf("")+""+Str3.lastIndexOf("")+""+str4.lastIndexOf("")+Str5.lastIndexOf("")+""+Str6.lastIndexOf("")+""+Str7.lastIndexOf("")+""+Str7.lastIndexOf(""));
        System.out.println("the first characters:" + Str1.charAt(0)+""+str2.charAt(3)+""+Str3.charAt(3)+""+str4.charAt(3)+""+Str5.charAt(3)+""+Str6.charAt(2)+""+Str7.charAt(2)+""+Str8.charAt(2));
        System.out.println("fifth characters: "+ Str1.charAt(0+5)+""+str2.charAt(3+5)+""+Str3.charAt(3+5)+""+str4.charAt(3+6)+""+Str5.charAt(2+5)+""+Str6.charAt(2+5)+""+Str7.charAt(2+5)+""+Str8.charAt(2+5));



























    }







































}
