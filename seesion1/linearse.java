import java.util.*;
import java.lang.*;
public class linearse{
    public static int Linear(int num[] ,int key){
          for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
          }
          return -1;
    }
    public static int Linear(int num[] ){
        int lar=0;
        for(int i=0;i<num.length;i++){
          if(num[i]>lar){
             lar=num[i];
          }
        }
        return lar;
  }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]= {10,120,100,60,90};
        int Largest =Linear(arr);
        System.out.println("The Largest Number is "+ Largest);
   
    }
}