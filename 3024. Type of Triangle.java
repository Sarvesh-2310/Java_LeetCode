class Solution {
    public String triangleType(int[] nums) {
        if(nums.length!=3) return "none";

        int a=nums[0],b=nums[1],c=nums[2];
        if(a+b<=c || b+c<=a || a+c<=b) return "none"; 
        if(a==b && b==c) return "equilateral";
        else if(a==b || b==c || a==c) return "isosceles";
        return "scalene";
    }
}
