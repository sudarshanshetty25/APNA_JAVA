public class printpairs {
    public static void printpairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int cur=arr[i];
            for(int j=i+1;j<arr.length;j++){
                    System.out.print("("+ cur +","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        printpairs(arr);
    
    }
}
