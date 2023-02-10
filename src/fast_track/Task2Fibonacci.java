package fast_track;

public class Task2Fibonacci {

    public static void main(String[] args) {

        int n = 8;

        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;

        }
        if (n == 0) {
            System.out.println(first);
        }else {
            System.out.println(second);
        }

    }

}
