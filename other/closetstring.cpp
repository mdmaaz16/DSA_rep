//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++

	int shortestDistance(vector<string> &s, string word1, string word2)
	{
int k=0,i,j;
	    int start=0;
		// Your code goes here
		for(i=0;i<s.size();i++)
		{
		    start=i;
		    if(s[i]==word1)
		    {
		        for(j=i+1;j<s.size();j++)
		        {
		            if(s[j]==word1)
		            {
		                k=1;
		                break;
		            }
		            if(s[j]==word2)
		            {
		                break;
		            }
		        }
		    }
		    if(k==0)
		    {
		        return j-start;
		    }
		    k=0;
		}
	}
    // Check if both word1 and word2 are found in the array
//{ Driver Code Starts.

int main() 
{
   	
   	string word1,word2,res;
   	cin>>word1;
   	cin>>word2;
   	vector<string> s;
   	int n,i;
	   cin>>n;
	   for(i=0;i<n;i++)
	   {
	   	cin>>res;
		   s.push_back(res);
	   }
	   int w = shortestDistance(s,word1,word2);
	   cout<<w<<endl;
    return 0;
}
// } Driver Code Ends
