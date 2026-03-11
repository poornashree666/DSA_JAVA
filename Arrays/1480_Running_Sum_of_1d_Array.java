class Solution {
    public int[] runningSum(int[] nums) {
        int start=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            start=start+nums[i];
            nums[i]=start;
        }
           return nums;
        
    }
}
