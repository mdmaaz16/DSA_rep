package stack;
class celebrity
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here
    	int cel=0,row=-1,j,k=-1;
    	for(int i=0;i<n;i++){
    	    for(j=0;j<n;j++){
    	        if(i==j) continue;
    	        if(M[j][i]==1){
    	            cel++;
    	            continue;
    	        }
    	        else{
    	            k=0;
    	        }
    	    }
    	    if(cel==n-1){
    	        row=i;
    	    }
    	    cel=0;
    	    k=-1;
        }
        if(row!=-1)
        for(int i=0;i<n;i++){
            if(M[row][i]==1){
                return -1;
            }
        }
        return row;
}
}
