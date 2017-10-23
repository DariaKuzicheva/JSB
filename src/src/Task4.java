import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("________Print \"odd or even\". Console input.________");
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int n = in2.nextInt();
        if ((n % 2) == 0) {
            System.out.println("Число " + n + " четное ");
        } else {
            if ((n % 2) != 0) {
                System.out.println("Число " + n + " нечетное ");
            }
        }

    }
}
