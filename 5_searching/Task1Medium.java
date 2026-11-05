// 34. Find First and Last Position of Element in Sorted Array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=search(nums,target,false);
        }

        return ans;
     }

    public int search(int[] nums ,int target,boolean findFirstIndex){
        int ans=-1,s=0,e=nums.length-1;
        while(s<=e){
            int mid =s + (e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                if(findFirstIndex == true){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
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
    // public int[] searchRange(int[] nums, int target) {
    //     int s=0,e=nums.length-1;
    //     int[] ans ={-1,-1};

    //     //finding start
    //     while(s<=e){
    //         int mid =s + (e-s)/2;
    //         if(nums[mid]==target){
    //             ans[0]=mid;
    //             e=mid-1;
    //         }else{
    //             if(nums[mid]>target){
    //                 e=mid-1;
    //             }else{
    //                 s=mid+1;
    //             }
    //         }
    //     }

    //     s=0;e=nums.length-1;
    //     //Finding ending

    //     while(s<=e){
    //         int mid =s + (e-s)/2;
    //         if(nums[mid]==target){
    //             ans[1]=mid;
    //             s=mid+1;
    //         }else{
    //             if(nums[mid]>target){
    //                 e=mid-1;
    //             }else{
    //                 s=mid+1;
    //             }
    //         }
    //     }

    //     return ans;
    // }
}