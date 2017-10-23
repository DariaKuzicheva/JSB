import java.util.Arrays;
import java.util.Random;

public class Task9 {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Bubble sort for two-dimensional array");

//new array creation
        int[][] arr = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = random.nextInt(10) - 5;
            }
        }
        System.out.println("_________1)Initial array_______");
        System.out.println(Arrays.deepToString(arr));

//beginning of the bubble sort
            int len = arr.length;
            for(int k = 0; k < len; k++){
                for(int i = 0; i < len; i++) {
                    for(int j = 0; j < arr[i].length-1; j++) {
                        if (arr[i][j] > arr[i][j + 1]) {
                            int temp = arr[i][j];
                            arr[i][j] = arr[i][j + 1];
                            arr[i][j + 1] = temp;
                        }
                    }
                    }
                }
        System.out.println("_________2)Array after bubble sort_______");
        System.out.println(Arrays.deepToString(arr));
        }
    }
