public class Sol_rom {
    public static void so_rom(int n){
        int i,j;
        for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
    }
}
public static void hol_rom(int n){
    int i,j;
    for(i=1;i<=n;i++){
        //spaces
        for(j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(j=1;j<=n;j++){
        if(i==1||i==n||j==1||j==n){
            System.out.print("*");
        }   
        else          {
            System.out.print(" ");  
        }
        }
        System.out.println();
}
}
    public static void main(String[] args) {
        //so_rom(5);
        hol_rom(5);
    }
}
