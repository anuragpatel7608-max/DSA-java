// 1470. Shuffle the Array
// look in leetcode

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int s=0;
        int[] ans =new int[2*n];
        boolean flag =true;
        for(int i=0;i<nums.length;i++){
            if(flag==true){
                ans[i]=nums[s++];
                flag =false;
            }else{
                ans[i]=nums[n++];
                flag =true;
            }
        }
        return ans;
    }
}