// 1431. Kids With the Greatest Number of Candies
// look in leetcode

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans =new ArrayList<>(candies.length);
        int top=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i] > top)
                top=candies[i];
        }
        for(int i=0 ;i<candies.length;i++){
            int sum =candies[i] + extraCandies;
            if(sum >= top)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}