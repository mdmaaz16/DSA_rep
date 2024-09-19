// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
import java.util.*;
public class mergeoverlappingintervals {
    public static void main(String[] args) {
        int a[][] = {{1,2},{4,5},{2,3}};
        Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
        int res[][] = new int[a.length][2];
        int start = a[0][0];
        int k=0;
        int end = a[0][1];
        for(int i=1;i<a.length;i++){
            if(a[i][0]<=end){
                end = Math.max(a[i][1],end);
            }
            else{
                res[k][0]=start;
                res[k][1]=end;
                k++;
                start=a[i][0];
                end=a[i][1];
            }
        }
        res[k][0]=start;
        res[k][1]=end;
        k++;
    }
}
