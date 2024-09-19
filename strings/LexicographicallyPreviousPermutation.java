package strings;
class LexicographicallyPreviousPermutation
{
    static boolean check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public String prevPermutation(String s)
    {
        // code here
        int n = s.length();
        // If the string is already the smallest permutation
        if (check(s)) {
            return "None";
        }

        // Step 1: Find the rightmost character which is greater than the next character
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                index = i;
                break;
            }
        }

        // Step 2: Find the largest character to the right of `index` which is smaller than `s[index]`
        int index1 = -1;
        for (int i = n - 1; i > index; i--) {
            if (s.charAt(i) < s.charAt(index)) {
                index1 = i;
                break;
            }
        }

        // Step 3: Swap characters at `index` and `index1`
        StringBuilder sb = new StringBuilder(s);
        char temp = sb.charAt(index);
        sb.setCharAt(index, sb.charAt(index1));
        sb.setCharAt(index1, temp);

        // Step 4: Reverse the substring to the right of `index`
        String left = sb.substring(0, index + 1);
        String right = sb.substring(index + 1);
        right = new StringBuilder(right).reverse().toString();

        return left + right;
    }
}
