/*
brute method is to generate all permuation of number and store it in arraylist and do a linear search in arraylist
optimal- break the array such that second number is placed closed to the difference between 1st number and it should
be greater ex: 2 1 5 4 3 0 0.
here 5 4 3 is greter than 2 and the closest to 2 is 3 which will come in second place after that all numbers are
sorted
2 3 0 0 1 4 5
*/
// package arrays;
/* 
public class nextpermutation {
    static void nextperm(int a[]){
        int index=-1;
        for(int i=a.length-2;i>=0;i--){
            if(a[i]<a[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverseArray(a,0,a.length-1);
            printArray(a);
            return;
        }
        for(int i=a.length-1;i>=index;i--){
            if(a[i]>a[index]){
                int temp=a[index];
                a[index] = a[i];
                a[i]=temp;
                reverseArray(a, index+1, a.length-1);
                printArray(a);
                return;
            }
        }
    }
    static void reverseArray(int a[],int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        nextperm(a);
    }
    
}
    */

import strings.reverse;

class nextpermutation{
    static void reversearray(int a[],int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void nextp(int a[]){
        int index=-1;
        for(int i=a.length-2;i>=0;i--){
            if(a[i]<a[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reversearray(a,0,a.length-1);
        }
        for(int i=a.length-1;i>=index;i--){
            if(a[i]>a[index]){
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
                reversearray(a, index+1, a.length-1);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        nextp(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}    
