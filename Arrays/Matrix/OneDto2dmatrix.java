package javaDsa.Arrays.Matrix;

public class OneDto2dmatrix {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6};
        int m = 2;
        int n = 3;
        Solution solution = new Solution();
        int[][] result = solution.construct2DArray(original, m, n);
        
        System.out.println("Constructed 2D array:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int res[][] = new int[m][n];
        if(m*n!=original.length)
            return new int[0][0];
        else{
            
            for(int i = 0;i<original.length;i++){
              
                res[i/n][i%n] = original[i];
            }
        }
        return res;
    }
}
