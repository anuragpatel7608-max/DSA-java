// 1672. Richest Customer Wealth
// // look in leetcode

class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length,n=accounts[0].length,max=0,sum=0;
        for(int i=0;i<m;i++){
            sum=0;
            for(int j=0;j<n;j++){
               sum+=accounts[i][j]; 
            }
            if(sum > max){
                max=sum;
            }
        }
        return max;
    }
}