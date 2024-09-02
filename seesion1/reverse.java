import java.util.*;
public class reverse {
    public static void reverse(int num[]){
        int first=0,last=num.length-1;
        while(first < last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,3,7,9};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
