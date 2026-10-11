class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        if(digits[i]!=9){
                digits[i]+=1;
                return digits;
        }
        int k=0;
        while(i>=0){
            if(digits[i]==9){
                k=1;
                digits[i]=0;
            }else{
                digits[i]+=k;
                k=0;
                return digits;
            }
            i--;
        }
        int[] arr =new int[digits.length+1];
        arr[0]=k;
        return arr;
    }
}