#include<iostream>
using namespace std;
int main(){
/*	int a[10];
	cout<<&a<<endl;  //prints address of 1st element
	cout<<&a[3]; //prints address of 3rd element
	int a[10]={2,5,7};
	cout<<*a; //prints 1st element value (2)
	cout<<*a+1; // increments 2 to 3
	cout<<*(a+1); //prints 5 second element
	int *p = &a[0];
	cout<<*(p+2)<<endl; //prints 7 because p was pointing to 0th element
*/
	int a[10]={1,2,3};
	//cout<<a<<endl;   // prints address of first element
	//cout<<&a<<endl; // prints address of first element
	//cout<<&a[0]<<endl; // prints address of first element
	int *p = &a[0];
	//cout<<p<<endl;  //it will print same address of a[0] or a or &a
	//cout<<&p<<endl; // it will print P's address which might be different
	//cout<<*p<<endl;	 //print value of first element
	p=p+1; //now it will print 1st element and if i do p+2 it will print 2nd element
	cout<<*p<<endl; //printing happens here values are changed previouly
}
