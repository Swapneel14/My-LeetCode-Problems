class Solution {
    public boolean searchMatrix(int[][] m, int x) {
        if(m.length==0)return false;
        int row=0;
        int col=m[0].length-1;
        while(row<m.length&&row>=0&&col>=0&&col<m[0].length){
            if(m[row][col]==x)return true;
            if(m[row][col]>x)col--;
            else row++;
        }
        return false;
    }
}
