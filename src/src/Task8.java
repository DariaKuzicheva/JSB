import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        System.out.println("_________Print sum of digits of a natural number_________");
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n = in1.nextInt();
        int sum = 0;
        while(n != 0){
            sum = sum + (n % 10);
            n/=10;
        }
        System.out.println("Your sum is: " + sum);
    }
}
