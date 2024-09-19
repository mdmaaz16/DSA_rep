// https://www.geeksforgeeks.org/problems/lemonade-change/0
package greedyalgo;
class Solution {
    static boolean lemonade(int N, int bills[]) {
        // code here
        int i=0,a=0,b=0,c=0;
        for(i=0;i<N;i++){
            if(bills[i]==5){
                a++;
            }
            else if(bills[i]==10){
                if(a>0){
                    a--;
                    b++;
                }
                else{
                    break;
                }
            }
            else{
                if(a>0 && b>0){
                    a--;
                    b--;
                    c++;
                }
                else if(a>=3){
                    a=a-3;
                    c++;
                }
                else{
                    break;
                }
            }
        }
        if(i==N){
            return true;
        }
        else{
            return false;
        }
    }
    
}