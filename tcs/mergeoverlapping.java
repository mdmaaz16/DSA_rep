package tcs;
import java.util.*;
public class mergeoverlapping {
    public static void main(String[] args) {
        int a[][]={{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
        int res[][] = new int[a.length][2];
        int start=a[0][0],k=0;
        int end = a[0][1];
        for(int i=1;i<a.length;i++){
            if(end>a[i][0]){
                end=a[i][1];
                // System.err.println(end);
            }
            else{
                // System.out.print(start+" "+end);
                res[k][0]=start;
                res[k][1]=end;
                k++;
                start=a[i][0];
                end=a[i][1];
            }
        }
        if(start>res[k][0]){
            res[k][0]=start;
                res[k][1]=end;
                k++;
        }
        for(int i=0;i<k;i++){
            System.out.print(" "+res[i][0]+" "+res[i][1]);
        }
    }
}
