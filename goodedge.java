import java.util.Scanner;

public class goodedge {

    public static boolean isGoodEdge(int node1, int node2, int property) {
        // Assuming some conditions for a good edge, for example:
        // - The edge is "good" if the nodes have different values, and
        //   the property indicates a possible connection or alignment
        // - This logic may need to be adjusted based on the problem description

        return (node1 != node2) && (property == node1 || property == node2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int N = scanner.nextInt(); // Number of nodes
        int[] A = new int[N]; // Node labels array
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] P = new int[N]; // Edge properties array
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        // Counting good edges
        int goodEdgesCount = 0;
        for (int i = 0; i < N - 1; i++) {
            // Ensure the indices are within the bounds
            if (isGoodEdge(A[i], A[i + 1], P[i])) {
                goodEdgesCount++;
            }
        }

        // Output the result
        System.out.println(goodEdgesCount);

        scanner.close();
    }

   

   
}
