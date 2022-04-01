package day07_nestedIf;

public class c1_nestedIfParactice {


    public static void main(String[] args) {

        String personName="Aslihan";
int age=20;
double weight=50.0;
String results="";

if (age>18){
    if (weight>50.0){
        results=personName+"Is eligibale to give blood";
    }else{
        results=personName+"is not eligible to give blood";
    }

}else if (age>0 && age <=18){
    results=personName + "needs to be older than 18";
        }else{
    results="invalid age you entered"+age;

        }
        System.out.println(results);















    }


























}
