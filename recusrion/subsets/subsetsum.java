// arr=[5,2,1]
// o/p: 0 1 2 3 5 6 7 8

package subsets;

class subsetsum {
    static void sumsetsums(int index,int a[],int sum){
        if(index==a.length){
            System.out.println(sum);
            return;
        }
        sumsetsums(index+1, a, sum+a[index]);
        sumsetsums(index+1, a, sum);
    }
    public static void main(String[] args) {
        int a[]={5,2,1};
        sumsetsums(0,a,0);
    }
}
