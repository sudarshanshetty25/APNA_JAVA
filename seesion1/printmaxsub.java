public class printmaxsub {
    public static void printsubsum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end= j;
                int currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
           
        }
        System.out.println("sum is = "+maxsum);
    }
    public static void main(String[] args) {
        int s[]={2,3,4,5,6};
        printsubsum(s);
    }
}
