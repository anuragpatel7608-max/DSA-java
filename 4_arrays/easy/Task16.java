// 1295. Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int d=0;
            while(nums[i]!=0){
                d++;
                nums[i] /=10;
            }
            if(d%2==0)
                count++;
        }
        return count;
    }
}