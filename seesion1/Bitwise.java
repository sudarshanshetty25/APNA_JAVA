import java.util.*;

import javax.sound.midi.SysexMessage;
public class Bitwise {
    public static void oddoreven(int n){
        int bitMask=1;
        if((n & bitMask) == 1){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }

    }
    public static int getithBit(int n,int i){
        int bitMask=1<<i;
        if(( n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setithBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearithBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }

    public static int updateBit(int n,int i,int newBit){
        if(newBit==0){
            return clearithBit(n, i);
        }
        else{
            return setithBit(n, i);
        }
    }
    public static int clearlastbits(int n,int i){
        int bitMask= (~0)<<i;
        return n & bitMask;
    }
    public static int clearBitsinRange(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }
    public static boolean checkpower(int n){
        if((n&(n-1))==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int exponentialofnum(int a,int n){
        int ans=1;
        while (n>0) {
            if((n & 1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println((5&6));
        // System.out.println((5|6));
        // System.out.println((5^6));
        // System.out.println(~5);
        // System.out.println((5<<2));
        // System.out.println(6>>1);
        // oddoreven(7);
        // oddoreven(12);
        // System.out.println(getithBit(5, 2x));
        // System.out.println(setithBit(5, 1));
        // System.out.println(clearithBit(10, 1));
        // System.out.println(updateBit(5, 1, 1));
        // System.out.println(clearlastbits(15,2));
        // System.out.println(clearBitsinRange(10, 2, 4));
        // System.out.println(checkpower(15));
        // // System.out.println(countsetbits(15));
        // for(char ch='a';ch<='z';ch++){
        //     System.out.print((char)(ch |' '));
        // }
        System.out.println(exponentialofnum(5, 3));
    }
}
