class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a=new int[n][n];
        int add=1;
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                a[top][i]=add;
                add++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                a[i][right]=add;
                add++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    a[bottom][i]=add;
                    add++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    a[i][left]=add;
                    add++;
                }
                left++;
            }
        }
        return a;
    }
}
