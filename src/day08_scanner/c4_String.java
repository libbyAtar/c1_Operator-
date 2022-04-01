package day08_scanner;

public class c4_String {/////no need to import cause Java will import everything under lang packages

    public static void main(String[] args) {


// to create a string
        // for example
        String str="Hello";//by string literal:Java will check pool
                             // An sice we dont have hello java will create new string in pool memory
        String str2="Hello";// this wont create a new string under pool memot because we already
       // created hello
     // if string already exist in the pool a refernce to the pooled istance is returned.

        // reason of Java is using string literal logic is to make Java more eficient

        //2. By new keyword
String str3=new String("Hello");

        // what is the difference of== and equals
        System.out.println(str=str2);//true
        System.out.println(str==str3);//false
        //since we have 2 different object from diff memory it will be false

        //Strings are imutable
        //imutable means object is unchangeable and cannot be modified

        String si="New york";//this will be placed under string pool
        si="Virginia";



























    }


























}
