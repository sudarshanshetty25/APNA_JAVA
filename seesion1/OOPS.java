public class OOPS {
    public static void main(String[] args) {
        // Pen p=new Pen();
        // p.setcolor("Blue");
        // System.out.println(p.getcolor());

        // p.settip(10);
        // System.out.println(p.getTip());

        // 
        // student s1= new student();
        // s1.name="sudarshan";
        // s1.rollno=234;
        // s1.password="abcd";
        // student s2=new student(s1);
        // s2.password="xyz";
        // System.out.println(s2.name);

        // Fish shark=new Fish();
        // shark.eat();

        // Calculator cal=new Calculator();
        // System.out.println(cal.sum(7, 6));
        // System.out.println(cal.sum((float)1.5,(float)2.5));
        // System.out.println(cal.sum(1, 2, 3));

        // deer d=new deer();
        // d.eat();

        // horse h=new horse();
        // h.walk();
        // System.out.println(h.color);
        // h.changecolor();
        // System.out.println(h.color);

        student1 s=new student1();

        s.schoolName="jvm";

        student1 s1=new student1();
        System.out.println(s1.schoolName);

        
    }
}


class student{
    String name;
    int rollno;
    String password;

    //copy constructor
    student(student s1){
    this.name=s1.name;
    this.rollno=s1.rollno;
    
    }
    student(){
        System.out.println("Constructor loaded...");
    }
    student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    
}
class myAccount{
    public String username;
    private String password;
myAccount ma=new myAccount();
        // ma.username="Sudarshan";
        // ma.setpassword("abcd");
    public void setpassword(String pwd){
        password=pwd;
    }

}
class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}


//Inheritance

// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }


//Method Overloading

class Calculator{

    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}

//Method overriding
// class Animal{
//     void eat(){
//         System.out.println("Eats anything");
//     }
// }

// class deer extends Animal{
//     void eat(){
//         System.out.println("Eats Grass");
//     }
// }

abstract class Animal{
String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("Eats");
    }

    abstract void walk();
}

class horse extends Animal{

    void changecolor(){
        color="peach";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    void changecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

class student1{
    String name;
    int rollName;

    static String schoolName;
}

