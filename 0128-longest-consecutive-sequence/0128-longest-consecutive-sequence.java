class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        HashSet <Integer> numSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            numSet.add(nums[i]);

        }
        int longestsub=1;

        for(int num:numSet){
            if(numSet.contains(num-1)){
                continue;
            }
            else{
                int Currentnum=num;
                int Currentsub=1;
                while(numSet.contains(Currentnum+1)){
                    Currentnum++;
                    Currentsub++;
                }
                longestsub=Math.max(Currentsub,longestsub);
            }
        }
        return longestsub;
        
    }
}