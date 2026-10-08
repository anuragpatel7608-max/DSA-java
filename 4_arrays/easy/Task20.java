// 1886. Determine Whether Matrix Can Be Obtained By Rotation

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int[][] tmp =new int[mat.length][mat[0].length];
        boolean flag =false;
        for(int m=0;m<4;m++){
            for(int i=mat.length -1 ,k=0;i>=0;i--,k++){
                for(int j=0;j<mat.length;j++){
                    if(m%2==0){
                        tmp[j][k]=mat[i][j];
                    }else{
                        mat[j][k]=tmp[i][j];
                    }
                }
            }
            flag=true;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat.length;j++){
                    if(m%2==0){
                        if(tmp[i][j]!=target[i][j]){
                            flag=false;
                        }
                    }else{
                        if(mat[i][j]!=target[i][j]){
                            flag=false;
                        }
                    }
                    if(flag==false)
                        break;
                }
                if(flag==false)
                    break;
            }
            if(flag==true)
                return flag;
        }
        return flag;
    }
}