// 1832. Check if the Sentence Is Pangram
// A pangram is a sentence where every letter of the English alphabet appears at least once.

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] num =new int[26];
        for(int i=0;i<sentence.length();i++){
            char c =sentence.charAt(i);
            int a=c;
            a -= 97;
            num[a]++;
        } 
        for(int i=0 ;i<26;i++){
            if(num[i]==0){
                return false;
            }
        }
        return true;
    }
}