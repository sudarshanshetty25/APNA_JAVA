import java.lang.Math;
public class bintodec {
    public static void bintodec(int binum) {
        int pow=0;
        int decnum=0;
        while (binum > 0) {
            int lo=binum %10; 
            decnum=decnum + lo * (int)Math.pow(2, pow);
            pow++;
            binum=binum/10;
        }
        System.out.println(decnum);
    }
    public static void main(String[] args) {
        bintodec(10);
    }
    
}
