// 1304. Find N Unique Integers Sum up to Zero
class Task22 {
    public int[] sumZero(int n) {
        int[] ans =new int[n];
        int v=n;
        for(int i=0,j=n-1;i<n/2;i++,j--){
            if(i!=j){
                ans[i]=-v;
                ans[j]=v;
            }
            v--;
        }
        if(n%2==1){
            ans[n/2]=0;
        }
        return ans;
    }
} 
