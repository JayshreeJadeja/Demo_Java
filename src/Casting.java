package src;

public class Casting {
    public static void main(String[] args) {
    //Casting  - Molding
        byte b=10;
        int a=b; //Implicit casting by JVM

        int a1=300;
        byte b1= (byte)a1;
        System.out.println("Casting " +b1);

        int course =100;
        float GST=0.1458f;
        float total= course + GST * course;
        System.out.println("GST ans total "+total);

        //widening is process of converting higher type to lower type - JVM do it
        //Narrowing is the process of converting higher type to lower type
    }
}
