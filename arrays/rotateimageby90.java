// package arrays;
// class rotateimageby90 {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;
//        int m[][]=new int[matrix.length][matrix.length];
//        for(int i=0;i<n;i++){
//         int k=n-1;
//         for(int j=0;j<n;j++){
//             m[i][j]=matrix[k][i];
//             k--;
//         }
//        }
//        for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             matrix[i][j]=m[i][j];
//         }
//        }
//     } 
// }

class rotateimageby90{
    static void rotate(int a[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                if(i==j) continue;
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        int k=r/2;
        for(int i=0;i<r/2;i++){
            for(int j=0;j<c;j++){
                int temp = a[j][i];
                a[j][i] = a[j][c-i-1];
                a[j][c-i-1] = temp;
            }
        }
        print(a,3,3);
    }
    static void print(int a[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(a,3,3);
    }
}