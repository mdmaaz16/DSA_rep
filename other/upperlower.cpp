#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main()
{
	string s;
	getline(cin,s);
	int i;
//	for(i=0;i<s.length();i++)
//	{
//		if(s[i]>=65 && s[i]<=91)
//		s[i]+=32;
//		else if(s[i]>=97 && s[i]<=122)
//		s[i]-=32;
//	}
	string s2="Maaz";
	if(s.compare(s2))
	{
		cout<<"Yes";
	}
	else
	{
		cout<<"No";
	}
	string n =  s.substr(2,3);
	cout<<n;
//	reverse(s.begin(),s.end());
//	cout<<s<<endl;
}
