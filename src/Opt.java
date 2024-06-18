package src;

public class Opt {

    public static void main(String[] args) {
// Operators
        int  num1=60;
        int num2=70;
       // System.out.println(num1+num2);

        //Unary operator -10 /-20

         //   Logical operator
        // ! only allow with boolean  , &&  , || -> true || true= t /  False || False =false

        System.out.println("*************Logical operator*************");

        boolean a12= true;
        System.out.println(a12);
        //System.out.println(!a12);
        //System.out.println (!(10>20));

        System.out.println( true || true );
        System.out.println(true || false);
        System.out.println(false|| true);
        System.out.println(false || false);

        //System.out.println(!10);
        //Relational operator > / < / >= / <= /== /!=
        System.out.println("******** Relational operator *********");
        int age1 =20;
        int age2= 10;boolean res=age1 >= age2;
        System.out.println("age is"+res);
        System.out.println(10 >= 10);
        System.out.println(10 == 10);
        System.out.println(10 <= 10);
        System.out.println(10 > 10);
        System.out.println(10 < 10);
        System.out.println('A' == 65);
        System.out.println('A'==65.0);
        int b1=65;
        System.out.println('A'== b1);
        System.out.println(true == true);
        //System.out.println(true>= true);
        //System.out.println(true == 0);


        //Compound operator += /-= / /= /*=
        System.out.println("*************Compound opt******************");
        int a;
        int a1= 10;
         a1+= 12;

         int b=10;
         b-=20;
        System.out.println(a1);
       System.out.println(b);

    }
}
