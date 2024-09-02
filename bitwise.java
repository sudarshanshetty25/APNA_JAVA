import java.util.Scanner;

public class bitwise {

    public static boolean isTestedOk(int a, int b) {
        return ((a & b) * 2 < (a | b));
    }

    public static int countBitwise(int[] arr, int n) {
        int[] dp = new int[n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((arr[j] < arr[i]) && isTestedOk(arr[j], arr[i])) {
                    if (dp[i] < dp[i] + 1) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
            if (dp[i] > count) {
                count = dp[i];
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = countBitwise(arr, n);

        System.out.println("The result is " + result);

    }
}
