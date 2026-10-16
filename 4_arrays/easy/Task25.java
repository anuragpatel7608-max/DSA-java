// 566. Reshape the Matrix
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((r==mat.length && c==mat[0].length)|| (mat.length * mat[0].length) !=(r*c))
            return mat;
        
        int[] rmat =new int[r*c];
        int[][] rrmat =new int[r][c];
        int m=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                  rmat[m++]=mat[i][j];
            }
        }
        m=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rrmat[i][j]=rmat[m++];  
            }
        }

        return rrmat;
    }
}