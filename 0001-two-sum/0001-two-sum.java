class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> Map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int compliement = target - nums[i];

            if (Map.containsKey(compliement)){
                return new int []{Map.get(compliement),i};
            }

            Map.put(nums[i],i);
        }
        return new int [] {};
    }
    
}