// 69. Sqrt(x)

class Solution {
    public int mySqrt(int x) {
        int s = 0, e = x;
        int ans = 0;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid==0||mid <= x / mid) {
                ans = mid;
                if((mid+1) > x/(mid+1))
                    return ans;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }
}
