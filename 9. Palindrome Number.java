class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<=9) return true;
        int a=0;
        int temp=x;
        while(temp>0){
            int rem=temp%10;
            a=a*10+rem;
            temp/=10;
        }
        return x==a?true:false;
    }
}
