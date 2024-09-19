#include<iostream>
using namespace std;
void fun(int *a,int *b){
	cout<<"In function"<<endl;
	cout<<"A value is:"<<*a<<endl;
	cout<<"B value is:"<<*b<<endl;
	cout<<"After changing"<<endl;
	*a=++(*a);
	*b=++(*b);
}
int main()
{
	int a=4,b=5;
	fun(&a,&b);
	cout<<"In main function:"<<endl;
	cout<<a<<endl;
	cout<<b<<endl;
}
