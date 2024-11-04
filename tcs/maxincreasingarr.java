package tcs;


class maxincreasingarr {
    public int lenOfLongIncSubArr(List<Integer> arr) {
        // Your Code goes here.
        int maxLength=0,c=0;
        for(int i=0;i<arr.size();i++){
            int ele =arr.get(i);
            c=1;
            for(int j=i+1;j<arr.size();j++){
                if(ele<arr.get(j)){
                    c++;
                    maxLength = Math.max(maxLength,c);
                    ele=arr.get(j);
                }
                else{
                    break;
                }
            }
        }
        return maxLength;
    }
}