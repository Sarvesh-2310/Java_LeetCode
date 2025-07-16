class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left=0,right=1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                return true;
            }
            left++;
            right++;
        }
        return false;
    }
}
