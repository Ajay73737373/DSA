class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left=0,right=n-1;
        int water=0;
        int leftmax=height[left];
        int rightmax=height[right];

        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftmax){
                    leftmax = height[left];
                }
                else{
                    water+=leftmax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightmax){
                    rightmax = height[right];
                }else{
                    water+=rightmax - height[right];
                }
                right--;
            }

        }
        return water;
    }
}