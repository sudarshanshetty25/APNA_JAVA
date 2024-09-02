import java.util.Scanner;
public class gridpath {
   
    public static final int MOD = 1000000007;

    public static int getMaxSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][2];

        // Initialize the first row of dp with the first row of grid
        dp[0][0] = grid[0][0];
        dp[0][1] = grid[0][1];

        // Fill the dp table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                dp[i][j] = grid[i-1][j];
                for (int k = 0; k < 2; k++) {
                    if (grid[i][j] > grid[i - 1][k]) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + grid[i][j]);
                    }
                }
            }
        }

        // Find the maximum sum in the last row
        int result = Math.max(dp[n - 1][0], dp[n - 1][1]);

        // Return the result modulo 10^9 + 7
        return result % MOD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            grid[i][0] = scanner.nextInt();
            grid[i][1] = scanner.nextInt();
        }
        
        int result = getMaxSum(grid);
        System.out.println(result);
    }
}

