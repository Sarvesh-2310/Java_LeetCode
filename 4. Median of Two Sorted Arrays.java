class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a=new int[nums1.length + nums2.length];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            a[index++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            a[index++]=nums2[i];
        }
        Arrays.sort(a);
        int n=a.length;
        if(n%2==0){
            return (a[n/2-1]+a[n/2])/2.0;
        }
        return a[n/2];
    }   
}
