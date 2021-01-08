package Task11;

public class Solution {
    public static void main(String[] args) {
        long numbs = value(50);
        System.out.println("The fiftieth value of Fibonacci number is: " + numbs);
    }
    public static long value(long f) {
        if (f == 0) {
            return 0;
        } else if (f == 1) {
            return 1;
        } else {
            return value(f - 1) + value(f - 2);
        }
    }
}

