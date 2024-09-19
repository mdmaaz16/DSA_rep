#include<iostream>
using namespace std;
/*
// in this program two method is defined to assign pointers
int main(){
	int *p=0; //creating null pointer
	int a=5;
	p=&a; //still the pointer is pointing to a
	cout<<*p<<endl;
	int *q=&a; //traditional way
	cout<<q<<endl;
	cout<<++(*q)<<endl;
}
int main(){
	int a=5;
	int *p=&a;
	int c=*p;
	cout<<a<<endl;  //5
	cout<<*p<<endl;  //5
	cout<<c<<endl;  //5
	c++;
	cout<<a<<endl;  //5
	cout<<*p<<endl;  //5
	cout<<c<<endl;  //6
}*/
int main(){
	int a=3;
	int *p=&a;
	int *q = p; //copying a pointer
	cout<<++(*q)<<endl;
	cout<<&a<<"-"<<p<<"-"<<q<<endl;
	cout<<a;
}
