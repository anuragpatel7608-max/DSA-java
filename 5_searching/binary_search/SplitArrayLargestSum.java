// 410. Split Array Largest Sum


class Solution {
    public int splitArray(int[] nums, int k) {
        int s=nums[0] ,e=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] > s ){
                s=nums[i];
            }
            e+=nums[i];
        }
        if(k==1){
            return e;
        }if(k==nums.length){
            return s;
        }

        while(s<e){
            int mid =s+(e-s)/2;
            int p=1,sum=0;
            for(int i=0;i<nums.length;i++){
                if(sum + nums[i] <= mid){
                    sum+=nums[i];
                }else{
                    p++;
                    sum=nums[i];
                }
            }
            if(p <= k){
                e=mid;
            }else{
                s=mid+1;
            }
            
        }

        return e;
    }
}
