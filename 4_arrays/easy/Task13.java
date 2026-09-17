// 832. Flipping an Image
public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            for(int j=0 ,k=image.length -1;j<image.length/2;j++,k--){
                int tmp=image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=tmp;
            }
            for(int j=0 ;j<image.length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}