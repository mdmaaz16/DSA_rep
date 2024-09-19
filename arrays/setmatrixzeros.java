// package arrays;
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
// You must do it in place.
// Example 1:
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
import java.util.*;
//brute method in notebook
//this is better approach
public class setmatrixzeros {
    public static void main(String[] args) {
        int a[][]={{1,1,1},
        {1,0,1},
        {0,1,1}};
        int row[] = new int[a.length];
        int col[] = new int[a[0].length];
    
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(row[i]==1 || col[j]==1){
                    a[i][j]=0;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
