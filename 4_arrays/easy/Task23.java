// 1380. Lucky Numbers in a Matrix
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            int index=0;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j] < min){
                    min =matrix[i][j];
                    index=j;
                }
            }
            boolean flag =true;
            for(int j=0;j<matrix.length;j++){
                if(min < matrix[j][index]){
                    flag=false;
                    break;
                }
            }
            if(flag)
                ans.add(min);
            
        }

        return ans;
    }
}