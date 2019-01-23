public class Assignment1 {

    public static int c(int n, int k){
        return c(n-1, k-1) + c(n-1, k);
    }

    public static int P(int n){
        return P(n-1) + P(n-2);
    }

    public static String writeLine(char c, int n) {
        return c + writeLine(c,n-1);
    }
}
