class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> Set = new HashSet<>();
        for(int num : nums1){
            Set.add(num);
        }
        HashSet<Integer> answer = new HashSet<>();
        for(int num : nums2){
            if(Set.contains(num)){
                answer.add(num);
            }
        }
        int[] result = new int[answer.size()];
        int i = 0;
        for(int num : answer){
            result[i++] = num;
        }
        return result;
    }

}