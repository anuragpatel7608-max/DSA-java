// 1572. Matrix Diagonal Sum
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0,j=0,k=mat.length -1;i<mat.length;i++,j++,k--){
            sum += mat[i][j] + mat[i][k];
        }
        if(mat.length%2!=0){
            sum -= mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}