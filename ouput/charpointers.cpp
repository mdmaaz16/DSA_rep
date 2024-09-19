#include<iostream>
using namespace std;
//int main(){
//	char c[6]="abcde";
//	cout<<c<<endl; //print full value
//	char *a = &c[0];
//	cout<<*a<<endl;
//}
void check(int a[]){
	for(int i=0;i<6;i++){
		a[i]=a[i]*2;
		cout<<a[i]<<" ";
	}
}
int main(){
	
	int a[10]={1,2,3,4,5,6};
	check(a);
	for(int i=0;i<6;i++){
		cout<<a[i]<<" "; //here value is changed
	}
}
