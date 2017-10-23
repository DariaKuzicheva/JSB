import java.util.Arrays;
import java.util.Random;

public class Task6 {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("_________New array creating with random elements from 1 to 10_________");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(9) + 1;
        }
        System.out.println(Arrays.toString(arr));


        System.out.println("_________Change all elements with odd indexes to 0_________");
        int [] x = new int [8];
        for(int i = 0; i < arr.length; i++)
        {
            if ((i%2) != 0) {
                x[i] = 0;
            }
            else x[i] = arr[i];

            System.out.println("x = " + x[i]);
        }
        System.out.println(Arrays.toString(x));
    }
}
