package Javahw;

public class t5_oddorEven {

// create java program that will check if you number is even or odd
//examples
    //if number is 20 print :20 is even number
    //if number is 33 print: 33 odd number

    public static void main(String[] args) {

     ////ternary
        //if==?
        //else==:

     ///////////////////////////////////
//// create a java program
////////    100 to 85 is grade A
///////     70 to 84 is grade B
//////     60 to 69 is grade c
////       40 to 59 is grade D
///          0 to 39 is grde F
//if number is not 0-100 is "invalid number
//if==
//else==:
//:?==else if

int score=75;
char grade='0';

String result="";

if(score>=85&&score<=100){
grade='A';
    }else if(score>=70&& score<=84){
grade='B';

}else if(score>= 60&& score<70){
grade='C';
}else if(score>=0&& score<39){
grade='f';
        }else{// this part will true if number is minus or bigger than 100
grade='0';
}
result="Student grade is:"+grade;
        System.out.println(result);

//////Ternary
//if?
int score1=90;

        if(score>=85&&score<=100){
            System.out.println( score+ "is gradeB");
        }
   else if (score>=69&&score>=60)
            System.out.println(score+"is grade C");{
        }












    }






}