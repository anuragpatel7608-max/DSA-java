// 1773. Count Items Matching a Rule
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int s;
        if(ruleKey.equals("type")){
            s=0;
        }else if(ruleKey.equals("color")){
            s=1;
        }else{
            s=2;
        }
        int count=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(s).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}