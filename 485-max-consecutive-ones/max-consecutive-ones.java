class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxAns = 0;
        int currCount = 0;
        for(int j =0;j < n;j++){
            if(nums[j]==1){
                currCount++;
            }
            else{
                maxAns = Math.max(maxAns,currCount);
                currCount = 0;
            }
        }
        maxAns = Math.max(maxAns,currCount);
        return maxAns;
    }
}