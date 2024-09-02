import java.util.*;
import java.math.*;
import java.util.Arrays;
public class Binaryse {
    public static int BSearch(int num[],int key){
        int low=0,high=num.length-1;
        while(low<=high){
    int mid=(low+high) / 2;
    if(num[mid]==key){
        return mid;
    }
    if(num[mid]<key){
        low=mid+1;
    }
    else{
      high=mid-1;
    }
}
return -1;
    }

    public static void main(String[] args) {
        int arr[]={10,30,20,5,80,50};
        Arrays.sort(arr);
        int key=20;
        System.out.println("KEY IS FOUND AT "+ BSearch(arr, key));

    }
}
