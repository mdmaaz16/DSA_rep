package bitmanipulation;

public class setithbit {
    public static void main(String[] args) {
        int n = 8;
        int k=2;
        int b = 1<<k;
        System.out.println(b);
        int res = n&b;
        System.out.println(res);
    }
}
