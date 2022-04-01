package day04_unaryOperators;

public class c3_psotPreConditions {


    public static void main(String[] args) {


    int x=10;
        System.out.println(x);
    // precondition
        System.out.println(++x);// pre condiotion will increase your numbe imediately
        System.out.println(x);


        System.out.println(+x);

    int y=20;
        System.out.println(y);
        //post condition
        System.out.println(y++);//20
        System.out.println(y);

        byte number1=30;
        System.out.println(x);
        System.out.println(--x);

        int number2=50;
        System.out.println(number2--);//post// but will be 49 on nxt line
        System.out.println(number2--);//49 post condition but it will be 48 on nxt line
        System.out.println(--number2);//pre//48 and since it was pr conditioned it is
        System.out.println(number2++);
        System.out.println(number2);///48


    }

















}
