import java.util.Scanner;

public class factorial {
    public static int factofn(int n){
        int i,f=1;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factofn(n));
    }
}
