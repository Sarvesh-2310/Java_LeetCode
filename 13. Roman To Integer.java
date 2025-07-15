class Solution {
    public int romanToInt(String s) {
        s=s.toLowerCase();
        String s1="ivxlcdm";
        int[] a={1,5,10,50,100,500,1000};
        int sum=0;
        for(int i=0;i<s.length();i++){
            int current= a[s1.indexOf(s.charAt(i))];
            if(i<s.length()-1 && current<a[s1.indexOf(s.charAt(i+1))]){
                sum-=current;
            }else{
                sum+=current;
            }
        }
        return sum;
    }
}
