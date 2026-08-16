class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int [nums.length];
        Arrays.fill(result,1);

        int pre=1,post=1;

        // traverse from left to right
        for(int i=0; i<nums.length;i++){
            result[i] = result[i]*pre;
            pre=pre*nums[i];
        }

        // traverse from right to left
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*post;
            post=post*nums[i];
        }

        return result;
        
    }
}