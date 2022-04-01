package Code_With_Mosh;

import java.awt.*;
import java.util.Arrays;

public class m1_codeWithm {

    public static void main(String[] args) {

        byte x=1;//
        byte y=x;
        x=2;
        System.out.println(y);
        Point point1= new Point(x=1,y=1);
        Point point2=point1;
        point1.x=2;
        System.out.println(point2);

/////
      String message="c:\tWindows\\...";
        System.out.println(message);

///////////////Arrays
int [ ] numbers={2,3,5,1,4};
Arrays.sort(numbers);

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
/////multi dimentional Arrays









    }


}
