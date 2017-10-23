import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        System.out.println("________Print all positive dividers for number. Console input.______");
        int b;
        int count = 0;
        System.out.println("Enter your natural number:");
        Scanner in3 = new Scanner(System.in);
        b = in3.nextInt();
        System.out.println("Number " + b + " can be divided by:");
        for (int i = 1; i <= b; i++) {
            if ((b % i) == 0) {
                System.out.println(i + " ");
            }

        }
    }
}
