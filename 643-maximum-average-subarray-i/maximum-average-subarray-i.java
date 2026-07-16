class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i<k;i++){
            sum += nums[i];
        }
        int maxAns = sum;
        for(int j = k; j < n; j++){
            sum += nums[j];
            sum -= nums[j-k];
            maxAns = Math.max(maxAns,sum);
        }
        return (double) maxAns / k;
    }
}