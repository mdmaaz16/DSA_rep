package bitmanipulation;

public class togglebit {
    public static void main(String[] args) {
        int n=13;
        int k=1;
        int b = 1<<k;
        int res = n^b;
        System.out.print(res);
    }
}
