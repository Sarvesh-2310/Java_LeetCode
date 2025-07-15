class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(j>i && nums[j]>nums[i]){
                int sum=nums[j]-nums[i];
                if(sum>max){
                    max=sum;
                }
            }
            else{
                i=j;
            }
        }
        if(max==0) return -1;

        return max;
    }
}
