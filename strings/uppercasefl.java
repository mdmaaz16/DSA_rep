package strings;
public class uppercasefl {
    static String convert(String s){
        StringBuilder sb = new StringBuilder();
        String res[] = s.split("\\s");
        for(int i=0;i<res.length;i++){
            sb.append((char)(res[i].charAt(0)-32));
            sb.append(res[i].substring(1,res[i].length()-1));
            sb.append((char)(res[i].charAt(res[i].length()-1)-32));
            if(i<res.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "mohamed maaz studying in vit vellore";
        System.out.println(convert(s));
    }
}
