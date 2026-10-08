// 1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] rt =new int[2];
        for(int i =0 ;i<nums.length ;i++){
            for(int j=i+1 ;j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    rt[0]=i;
                    rt[1]=j;
                    return rt;
                }
            }
        }
        return rt;
    }
}