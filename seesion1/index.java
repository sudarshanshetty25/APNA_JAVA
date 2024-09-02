import java.util.*;
public class index{
    public static void main(String[] args) {
    //     System.out.println("****");
    //       System.out.println("***");
    //         System.out.println("**");
    //           System.out.println("*");
// int a=10;
// int b=++a;
// System.out.printlnclar(a);
// System.out.println(b);
// int c=10;
// int d=c++;
// System.out.println(c);
// System.out.println(d);
// int a=10;
// a+=10;
// System.out.println(a);




// int age =16;
// if(age>=18){
//     System.out.println("adult:Drive,Vote");
// }
// if(age >13 && age<18){
//         System.out.println("Tennager");
// }
// else{
//         System.out.println("not adult");
// }



// int a=15;
// int b=15;
// if(a==b)
// {
//         System.out.println("Numbers are Same");
// }
// else if(a>b){
//         System.out.println("a is a grater than b");
// }
// else{
//         System.out.println("b is grater than a");
// }

// Scanner S=new Scanner(System.in);
// int n=S.nextInt();
// if(n%2==0){
//         System.out.println("Even number");
// }
// else{
//       System.out.println("Odd number");
// }
//     }
// }
// int A=1,B=3,C=6;
// if(A>=B && A>=C){
//     System.out.println("A");
// }
// else if(B>=C){
//     System.out.println("B");
// }
// else{
//     System.out.println("C");
// }
Scanner s= new Scanner(System.in);
System.out.println("enter the two numbers");
int a=s.nextInt();
int b=s.nextInt();
System.out.println("+ - * /");
System.out.println("enter the choice");
char ch=s.next().charAt(0);
switch(ch){
    case '+':System.out.println("The addition of two numbers are "+(a+b));
            break;
    case '-':System.out.println("The Subtraction of two numbers are "+(a-b));
            break;
    case '*':System.out.println("The Product of two numbers are "+(a*b));
            break;
    case '/':System.out.println("The Queotient of two numbers are "+(a/b));
            break;
    default:System.out.println("Enter the valid choice");
}


    }
}