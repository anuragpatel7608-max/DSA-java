// 34. Find First and Last Position of Element in Sorted Array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int[] ans ={-1,-1};
        while(s<=e){
            int mid =s+(e-s)/2;
            if(nums[mid]==target){
                int tmp=mid;
                while(nums[tmp]==nums[tmp-1]){
                    tmp--;
                }
                ans[0]=tmp;
                tmp=ans[0];
                while(nums[tmp]==nums[tmp+1]){
                    tmp++;
                }
                ans[1]=tmp;
                return ans;
                
            }else{
                if(target > nums[mid]){
                   s= mid+1;
                }else{
                   e=mid-1;
                }
            }
        }
        return ans;
    }
}