// 1732. Find the Highest Altitude
class Solution {
    public int largestAltitude(int[] gain) {
        int h=0,b=0;

        for(int i=0;i<gain.length;i++){
            b += gain[i];
            if(b > h){
                h=b;
            }
        }
        return h;
    }
}