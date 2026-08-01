class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int num : nums){
            if( first == num|| second == num || third == num){
                continue;
            }
            if(num > first){
                third = second;
                second = first;
                first = (long)num;
            }
            else if(num > second){
                third = second;;
                second = (long)num;
            }
            else if(num > third){
                third = (long)num;
            }
        }
        return third == Long.MIN_VALUE ? (int)first: (int)third;
    }
}