// 162. Find Peak Element
class Solution {
    public int findPeakElement(int[] nums) {
        //(my logic)

        // int s =0 ,e =nums.length -1;
        // int max = s + (e-s)/2;
        
        // while(s<=e){
        //     int mid =s +(e-s)/2;
        //     if(nums[mid] > nums[max] ){
        //         max =mid;
        //     }if( mid-1 != -1 && nums[mid-1] > nums[mid]){
        //         e=mid-1;
        //     }else{
        //         s=mid+1;
        //     }
            
        // }
        // return max;



        //find Peak element index (sir logic)
        int s =0 ,e =nums.length -1;
        while(s<e){
            int mid =s +(e-s)/2;
            if( nums[mid] > nums[mid+1]){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;

    }
}