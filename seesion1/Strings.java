import java.util.*;
public class Strings {
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        
    }
    public static boolean chckpali(String str){
        for(int i=0;i<str.length()/2;i++) {
        int n=str.length();
        if(str.charAt(i) != str.charAt(n-i-1)){
            //not a palindrome
            return false;
        }
    }
    return true;
    }

    public static float getshortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
            
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static String toUppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        // char a[]={'a','b','c'};
        // String name="Sudarshan";
        // String nam1=new String("XYZ!@#");
        // Scanner sc= new Scanner(System.in);
        // String hel;
        // hel=sc.nextLine();
        // System.out.println(hel.length());

        // String firstname="Sudarshan";
        // String lastname="Shetty";
        // String fullname=firstname+" "+lastname;
        // // System.out.println(fullname.charAt(0));
        // printletters(fullname);

        // String str="racecar";
        // System.out.println(chckpali(str));
        // String str="Hello World";
        // System.out.println(str.substring(0,5));
        // System.out.println(getshortestpath(path));
    //     String fruits[]={"applle","Mango","banana"};
    //     String largest=fruits[0];
    //     for(int i=1;i<fruits.length;i++){
    //         if(largest.compareToIgnoreCase(fruits[i])<0){
    //             largest=fruits[i];
    //         }
    //     }
    //     System.out.println(largest);
    // }

//     StringBuilder sb=new StringBuilder("");
//     for(char i='a';i<='z';i++){
//         sb.append(i);
//     }
//     System.out.print(sb);

String str="hi i am sudarshan";
System.out.println(toUppercase(str));

}
}