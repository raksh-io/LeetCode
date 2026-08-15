class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create Hashnet
        HashSet<Integer> SeenNumbers = new HashSet<>();

        for(int num:nums){
            if(SeenNumbers.contains(num)){
                return true;
            }
            SeenNumbers.add(num);
            }
        return false;
        }
        
    }
