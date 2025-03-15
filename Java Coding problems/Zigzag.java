import java.util.*;

public class Zigzag {
    static int[] zigzag(int[][] matrix, int m, int n) {
        int c = m * n;
        int i = 0;
        int[] arr = new int[c];
        boolean up = true;
        int row = 0; 
        int col = 0;
        
        while (i < c) {
            if (up) {
                // Traverse diagonally up-right
                while (row >= 0 && col < n) {
                    arr[i++] = matrix[row][col];
                    row--;
                    col++;
                }
                // Adjust for boundary cases
                if (col == n) {
                    row += 2;
                    col--;
                } else {
                    row++;
                }
                up = false;
            } else {
                // Traverse diagonally down-left
                while (col >= 0 && row < m) {
                    arr[i++] = matrix[row][col];
                    row++;
                    col--;
                }
                // Adjust for boundary cases
                if (row == m) {
                    col += 2;
                    row--;
                } else {
                    col++;
                }
                up = true;
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        // int[][] matrix = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        
        // int m = matrix.length;
        // int n = matrix[0].length;
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int c=m*n;
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //int [] arr=new int[c];
        int[] arr = zigzag(matrix, m, n);
        System.out.print(Arrays.toString(arr));
    }
}

