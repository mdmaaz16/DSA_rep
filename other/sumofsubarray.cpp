#include<iostream>
using namespace std;
int main()
{
	int n=74,s=665,i,j,f,l,sum=0;
	int a[100];
	for(i=0;i<n;i++)
	cin>>a[i];
	for(i=0;i<n;i++)
	{
		cout<<endl;
		cout<<sum;
		for(j=i;j<n;j++)
		{
			sum=sum+a[j];
			cout<<sum<<" ";
			//cout<<"h";
			if(sum==s)
			{
				f=i+1;
				l=j+1;
				cout<<"hello";
				break;
			}
			else if(sum>s)
			break;
		}
		if(sum==s){
		cout<<"The of elements from"<<f<<"to"<<l<<"position is"<<s;
		break;		
		} 
	
		sum=0;
	}
	//if(sum==s) 
		//cout<<"The of elements from"<<f<<"to"<<l<<"position is"<<s;
	
}
