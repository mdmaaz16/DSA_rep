#include<iostream>
using namespace std;
int main(){
//	int num=5;
//	int *p =&num;
//	cout<<(*p)++<<endl;
//	cout<<num++<<endl;
//	cout<<*p;
	int i=5;
	int *p=&i;
	int **p2 = &p;
	cout<<p<<endl;   //prints address of p
	cout<<*p2<<endl; //print the value of p2 which was address of p2
	
	//printing 5
	cout<<i<<endl;
	cout<<*p<<endl;
	cout<<**p2<<endl;
}
