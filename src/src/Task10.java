import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {

        System.out.println("________Fibonacci numbers______");
        int a = 1;
        int b = 1;
        int n = 11;

        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = a;
        arr[2] = b;

        for (int i = 3; i < n; i++) {
            int fib = a+b;
            a = b;
            b = fib;
            arr[i] = fib;
            }
        System.out.println(Arrays.toString(arr));
        }
    }
