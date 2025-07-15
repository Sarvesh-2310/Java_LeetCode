class Solution {
    public String[] divideString(String s, int k, char fill) {
		while(s.length()%k!=0) {
			s=s+fill;
		}
        int size=s.length()/k;
		String[] a=new String[size];
		int b=0,c=k;
		for(int i=0;i<a.length;i++){
			a[i]=s.substring(b,c);
			b=c;
			c+=k;
		}
        return a;
    }
}
