package strings;
public class reverse {
    public static void main(String[] args) {
        char c[] = {'h','e','l','l','o'};
        int temp = c.length-1;
        int i=0;
        while(i<c.length/2){
            char t = c[i];
            c[i] = c[temp];
            c[temp] = t;
            i++;
            temp--; 
        }
        System.out.println(c);
    }
}
