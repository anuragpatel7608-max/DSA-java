// 1095. Find in Mountain Array

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        //find Peak element index
        int s =0 ,e =mountainArr.length() -1;
        int min =-1;
        while(s<e){
            int mid =s +(e-s)/2;
            if( mountainArr.get(mid) > mountainArr.get(mid+1)){
                e=mid;
            }else{
                s=mid+1;
            }
        }

        //search in left side of peak element ascending order
        int a =orderAgnosticBinarySearch(mountainArr,0,s,target,true);
        if(a !=-1)
            return a;
        // search in right side of peak element descending order
        int b =orderAgnosticBinarySearch(mountainArr,s+1,mountainArr.length()-1,target,false);
        if(b !=-1)
            return b;

        return min;
        
    }
    public int orderAgnosticBinarySearch(MountainArray arr ,int s,int e,int target,boolean flag){
        if(s<=e){
            int mid =s+(e-s)/2;

            if(arr.get(mid)==target){
                return mid;
            }else{
                if(target > arr.get(mid)){
                    if(flag==true)    
                        return orderAgnosticBinarySearch(arr, mid+1, e, target,flag);
                    else
                        return orderAgnosticBinarySearch(arr, s, mid-1, target,flag);
                }else{
                   if(flag==true)    
                        return orderAgnosticBinarySearch(arr, s, mid-1, target,flag);
                    else
                        return orderAgnosticBinarySearch(arr, mid+1, e, target,flag);
                }
            }
        }
        return -1;
    }
}