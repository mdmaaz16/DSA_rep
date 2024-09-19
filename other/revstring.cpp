#include<iostream>
using namespace std;
#include<string>
#include<algorithm>

int main()
{
	string s;
	cout<<"Enter a string:";
	getline(cin,s);
//	cout<<s<<endl;
	reverse(s.begin(),s.end());
//	cout<<s<<endl;
	
	int start=0;
	int end=0;
	
	while(end<=s.length())
	{
		while(end<s.size() && s[end]!='.')
		{
			end++;
		}
		reverse(s.begin()+start,s.begin()+end);
		start=end+1;
		end=start;
	}
	cout<<s<<endl;
}
