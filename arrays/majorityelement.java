public class majorityelement {
    public static void mnumsin(String[] numsrgs) {
        int nums[] = {3,3,1,1,3,3};
        int cur = nums[0],c=1;
        for(int i=1;i<nums.length;i++){
            if(cur==nums[i]){
                c++;
            }
            else{
                c--;
            }
            if(c<=0){
                cur = nums[i];
            }
        }
        // System.out.println(cur);
        c=0;
        for(int i=0;i<nums.length;i++){
            if(cur==nums[i]){
                c++;
            }
        }
        if(nums.length/2<c){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");

        }
    }
}
