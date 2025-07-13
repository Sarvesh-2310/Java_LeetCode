class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        for(int j=0;j<nums.length;j++){
            for(int i=j+1;i<nums.length;i++){
            if(nums[j]+nums[i]==target){
                a[0]=j;
                a[1]=i;
            }
        }
        }
        
        return a;
    }
}
