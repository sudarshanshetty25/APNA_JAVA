import java.lang.*;

public class hallo_rec {
    public static void hallo_rect(int row,int cols) {
        int i,j;
        for( i=1;i<=row;i++){
            for( j=1;j<=cols;j++){
                if(i==1 || i==row || j==1 || j==cols){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       hallo_rect(4, 5);
    }
}