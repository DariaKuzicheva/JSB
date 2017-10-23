import java.util.Arrays;
import java.util.Random;

public class Task7 {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("_________New two-dimensional array creating with random elements from -5 to 5_______");
        int[][] arr = new int[7][4];
        int b, c = 0, max = 0;
        for (int i = 0; i < 7; i++) {
            b = 1;
            for (int j = 0; j<4; j++){
                arr[i][j] = random.nextInt(10) - 5;
                b *= Math.abs(arr[i][j]);
            }

            arr[i][0] = b;
            if (max < arr[i][0]) {
                max = arr[i][0];
                c = i;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("String index: " + c);

        }
    }
