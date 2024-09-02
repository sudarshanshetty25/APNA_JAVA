import java.util.Scanner;

public class longeseq {

    public static int subsequence(int arr1[],int arr2[],int n,int m){
        int[] table=new int[m];
        for(int j=0;j<m;j++){
            table[j]=0;
        }
        
        for(int i=0;i<n;i++){
            int cur=0;
            for(int j=0;j<m;j++){
                if (arr1[i] == arr2[j]){
                    if(cur+1>table[j]){
                        table[j]=cur+1;
                    }
                }
                if (arr1[i] > arr2[j]){
                if (table[j] > current){
                    current = table[j];
                }
            }
            }
        }
        int result = 0;
        for (int i=0; i<m; i++)
            if (table[i] > result)
            result = table[i];
 
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[];
        int[] arr2=new int[];

        for(int i=0;i<arr1.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
            arr[i]=sc.nextInt();
        }

        int n = arr1.length;
        int m = arr2.length;
 
    System.out.println("Length of LCIS is " +
                       LCIS(arr1, arr2, n, m));

    }
}
