
// 1389. Create Target Array in the Given Order



class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(target[index[i]]!=0 || index[i]+1 < target.length && target[index[i] +1 ] !=0){
                int j=index[i];
                int next=target[j];
                target[j]=nums[i];
                while(++j<target.length && target[j]!=0){
                    int tmp =target[j];
                    target[j]=next;
                    next =tmp;
                }
                target[j]=next;
            }
            target[index[i]]=nums[i];
        }
        return target;
    }
}