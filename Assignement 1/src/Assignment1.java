public class Assignment1 {

    public static int c(int n, int k) {
        if (k == n || k == 1 || k == 0) {
            return 1;
        } else if (k > n) {
            return 0;
        } else {
            return c(n - 1, k - 1) + c(n - 1, k);
        }
    }

    public static int P(int n) {
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return 3;
        } else {
            return P(n - 1) + P(n - 2);
        }
    }

    public static void writeLine(char ch, int n) {
        System.out.print(ch);
        if (n > 0) {
            writeLine(ch, n - 1);
        }
    }

    public static void writeBlock(char ch, int n, int m) {
        writeLine(ch, n);
        System.out.println();
        if (m > 0) {
            writeBlock(ch, n, m - 1);
        }
    }

    public static void reverseDigits(int n) {
        System.out.print(n%10);
        if (n > 0) {
            reverseDigits((n - n % 10) / 10);
        }
    }

    public static int myBinarySearch(String[] anArray, int first, int last, String value) {
            int mid = (last + first)/2;
        if (value.compareTo(anArray[mid]) < 0){
            return myBinarySearch(anArray,first,mid,value);
        }else if (value.compareTo(anArray[mid]) > 0) {
            return myBinarySearch(anArray, mid, last, value);
        } else{
            return mid;
        }
    }
}
