public class spiralmatrix {

    public static void spiralmat(int[][] matrix){
        int strow=0;
        int strcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(strow<=endrow && strcol <= endcol){
            //top
            for(int j=strcol;j<=endcol;j++){
                System.out.print(matrix[strow][j]+" ");
            }

            //right
            for(int i=strow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=strcol;j--){
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=strow+1;i--){
                System.out.print(matrix[i][strcol]+" ");
            }
            strcol++;
            strow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }

    public static int daigonalsum(int[][] matrix){
        // int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum +=matrix[i][j];
        //         }
        //         if(i+j==matrix.length-1);
        //         {
        //             sum +=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        int sum=0;
        for(int i=0;i<matrix.length;i++){
           
            //pd
            sum+=matrix[i][i];
            //sd
            if(i !=matrix.length-1-i)
                sum+=matrix[i][matrix.length-i-1];
            
        }

        return sum;
    }

    public static boolean sortedmatrix(int[][] matrix, int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        // spiralmat(matrix);
        // System.out.println("The sum is "+sortedmatrix(matrix,69));
        sortedmatrix(matrix, 10);
    }
}
