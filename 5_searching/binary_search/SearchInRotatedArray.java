// 33. Search in Rotated Sorted Array
class Solution {
    public int findPivot(int[] nums){
        int s =0,e=nums.length-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(mid < e && nums[mid] > nums [mid+1]){
                return mid;
            }if(mid > s && nums[mid] < nums[mid-1]){
                return mid-1;
            }if(nums[mid] <= nums[s]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot =findPivot(nums);
        
    
        int a =binarySearch(nums ,0,pivot,target);
        if(a!=-1)
            return a;
        int b =binarySearch(nums,pivot+1,nums.length-1,target);
        if(b!=-1)
            return b;
        
        return -1;

    }
    public int binarySearch(int[] nums ,int s, int e,int target ){
        int ans =-1;
        while(s<=e){
            int mid =s +(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }if(target > nums[mid]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
}