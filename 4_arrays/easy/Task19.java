// 1854. Maximum Population Year

class Solution {
    public int maximumPopulation(int[][] logs) {
        int max_count =0;
        int max =logs[0][0];
        for(int i=1950; i<=2050 ;i++){
            int count=0;
            for(int j =0 ; j< logs.length ;j++){
                int b =logs[j][0];
                int d =logs[j][1];

                if(b <= i && i < d){
                    count++;
                }
            }
            if(max_count < count){
                max_count =count;
                max =i;
            }
        }

        return max;
    }
}