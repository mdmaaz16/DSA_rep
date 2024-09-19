package strings;

public class toggle {
    static String convertToggle(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                sb.append((char)(c-32));
            }
            else if(c>='A' && c<='Z'){
                sb.append((char)(c+32));
            }
            else{
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Hey Mohamed Maaz How are You you will get in TCS Prime";
        System.out.println(convertToggle(s));
    }
}
