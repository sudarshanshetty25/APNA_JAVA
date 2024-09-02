public class butterfly {
    public static void butterfly(int n){
        int i,j;
        //1st half
        for(i=1;i<=n;i++){
            //stars
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    //2nd half
    for(i=n;i>=1;i--){
          //stars
          for(j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
    public static void main(String[] args) {
        butterfly(10);
    }
    
}
