package bitmanipulation;
class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int b = 1<<k;
        int res = n&b;
        if(res==0){
            return false;
        }
        else{
            return true;
        }
    }
    
}