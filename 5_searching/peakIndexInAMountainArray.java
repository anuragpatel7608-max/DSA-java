// 852. Peak Index in a Mountain Array

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s =0 ,e =arr.length -1;
        int max = s + (e-s)/2;
        
        while(s<=e){
            int mid =s +(e-s)/2;
            if(arr[mid] > arr[max] ){
                max =mid;
            }if( mid-1 != -1 && arr[mid-1] > arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
            
        }
        return max;
    }
}