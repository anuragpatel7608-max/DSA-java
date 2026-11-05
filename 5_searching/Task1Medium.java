// 34. Find First and Last Position of Element in Sorted Array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int[] ans ={-1,-1};

        //finding start
        while(s<=e){
            int mid =s + (e-s)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                e=mid-1;
            }else{
                if(nums[mid]>target){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }

        s=0;e=nums.length-1;
        //Finding ending

        while(s<=e){
            int mid =s + (e-s)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                s=mid+1;
            }else{
                if(nums[mid]>target){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }

        return ans;
    }
}