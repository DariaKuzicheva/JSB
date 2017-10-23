import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("_________Print sum of two variables. Console input._________");
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int input1 = in1.nextInt();
        System.out.println("Enter second number: ");
        int input2 = in1.nextInt();
        //int input3 = input1+input2;
        System.out.println("Your sum is: " + (input1 + input2));
    }
}
