class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder a=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                a.append(s.charAt(i));        
            }
        }
        int i=0,j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
