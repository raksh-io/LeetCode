class Solution {
    public int characterReplacement(String s, int k) {
        int [] occurances = new int[26];
        int left=0,right=0,ans=0;
        int maxOccurance=0;

        for(right=0;right<s.length();right++){
            maxOccurance=Math.max(maxOccurance,++occurances[s.charAt(right)-'A']);

            if(right-left+1-maxOccurance>k){
                occurances[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}