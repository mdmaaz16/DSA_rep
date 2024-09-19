package strings;

public class encrypt {
    static String encryptData(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append(' ');
                continue;
            }
            sb.append((char)(s.charAt(i)+3));
        }
        return sb.toString();
    }
    static String decryptData(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append(' ');
                continue;
            }
            sb.append((char)(s.charAt(i)-3));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Hi bro How are you";
        System.out.println(encryptData(s));
        String enc  = encryptData(s);
        String dec = decryptData(enc);
        System.out.println(dec);
    }
}
