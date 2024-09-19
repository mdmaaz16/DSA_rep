package BS;

class searchin2darray {
    static int findmax(int col,int a[][]){
        int max=a[0][col],row=0;
        for(int i=1;i<a.length;i++){
            if(max<a[i][col]){
                max=a[i][col];
                row=i;
            }
        }
        return row;
    }
    public int[] findPeakGrid(int[][] mat) {
        int low=0,high=mat[0].length-1,mid,left=0,right=0;
        while(low<=high){
            mid=(low+high)/2;
            int row=findmax(mid,mat);
            if(mid-1>=0){
                left=mat[row][mid-1];
            }
            else{
                left=-1;
            }
            if(mid+1<mat[0].length){
                right=mat[row][mid+1];
            }
            else{
                right=-1;
            }
            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row, mid};
            }
            else if(mat[row][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}