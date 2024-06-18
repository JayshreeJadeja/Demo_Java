package src;

import java.sql.SQLOutput;

class  T2{

    int id;
    String name;
void insertrecord(int t ,String s)
{
    id=t;
    name=s;

}

void displayinfo()
{
    System.out.println("ID is :"+id +"Name is "+name );
}
}
public class T1 {

    private static T2 t2;

    public static void main(String[] args) {


        T1 t =new T1();
        int a =10;
        System.out.println("T1"+ a + "Add new" + t);//

        T2 t1=new T2();
        T2 t2= new T2();
        //t1.id=10;
        //t1.name="Jayshree";
        //System.out.println("Id is" + t1. id + " Name" +t1.name);

        t1.insertrecord(111,"Jays");
        t2.insertrecord(222,"Vish");
        t1.displayinfo();
        t2.displayinfo();
    }
}
