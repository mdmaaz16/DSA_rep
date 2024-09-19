package BS;
class medianofarray 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int size=(n+m);
        int ele1=size/2;
        int ele2=(size/2)-1;
        int i=0,j=0,c=0;
        int e1=0,e2=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                if(c==ele1){e1=a[i];}
                if(c==ele2){e2=a[i];}
                c++;
                i++;
            }
            else{
                if(c==ele1){e1=b[j];}
                if(c==ele2){e2=b[j];}
                c++;
                j++;
            }
        }
        while(i<n){
            if(c==ele1){e1=a[i];}
            if(c==ele2){e2=a[i];}
            c++;
            i++;
        }
        while(j<m){
            if(c==ele1){e1=b[j];}
            if(c==ele2){e2=b[j];}
            c++;
            j++;
        }
        if(size%2==0){
           double res=(e1+e2)/2.0;
            return res; 
        }
        return (double) e1;
        
    }
}