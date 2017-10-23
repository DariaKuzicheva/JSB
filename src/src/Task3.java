
public class Task3 {

    public static void main(String[] args) {

        System.out.println("________WHILE. print all odd numbers in the range from 1 to 10.__________");
        int a = 1;
        while (a < 10) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}