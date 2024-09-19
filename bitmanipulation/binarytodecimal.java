package bitmanipulation;

class binarytodecimal {
    public int binary_to_decimal(String str) {
        // Code here
        int res=0,j=0;
        for(int i=str.length()-1;i>=0;i--){
            res+=Character.getNumericValue((str.charAt(i)))*Math.pow(2,j);
            j++;
        }
        return res;
    }
}