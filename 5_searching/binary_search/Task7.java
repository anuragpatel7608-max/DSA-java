// 744. Find Smallest Letter Greater Than Target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0,e=letters.length-1;

        while(s<=e){
            int mid =s+(e-s)/2;
            if(target < letters[mid]){
                e =mid-1;
            }else{
                s=mid+1;
            }
        }
        return letters[s%letters.length];
        

        // char ans=letters[0];
        // if(target >= letters[letters.length-1])
        //     return ans;
        // while(s<=e){
        //     int mid =s+(e-s)/2;
        //     if(letters[mid]==target ){
        //         if(letters[mid]==letters[mid+1]){
        //             int tmp=mid;
        //             while(letters[tmp]==letters[tmp+1]){
        //                 tmp++;
        //             }
        //             ans =letters[tmp+1];
        //             return ans;
        //         }
        //         ans =letters[mid+1];
        //         return ans;
        //     }else{
        //         if(target > letters[mid]){
        //             s=mid+1;
        //         }else{
        //             e =mid-1;
        //         }
        //     }
        // }
        // if(s>e){
        //     ans=letters[s];
        // }
        // return ans;

    }
}