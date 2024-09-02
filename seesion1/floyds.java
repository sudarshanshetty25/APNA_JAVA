public class floyds {
    public static void floyds_pat(int n){
        int i,j,count=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void zo_pat(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1"+" ");
            }
            else
            System.out.print("0"+" ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        floyds_pat(5);
        System.out.println();
        zo_pat(5);
    }
}
