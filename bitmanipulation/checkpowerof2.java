package bitmanipulation;

public class checkpowerof2 {
    public static void main(String[] args) {
        int n=31;
        int res = n&n-1;  //it will give 0 if power of 2 notes in notebook
        System.out.println(res);
    }
}
