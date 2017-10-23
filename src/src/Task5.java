import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        int[] arr = {-2, 5, 7, 8, -3, 0};
        System.out.println("_________Initial Array_________");
        System.out.println(Arrays.toString(arr));

//sub-task1
        System.out.println("_________Print all not negative elements of the array_________");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }

        }

//sub-task2
        System.out.println("_________Processing of elements with odd indexes_________");
        int [] x = new int [6];
        for(int i = 0; i < arr.length; i++)
        {
            if ((i%2) != 0) {
                x[i] = arr[i]*2;
            }
            else x[i] = arr[i];

            System.out.println("x = " + x[i]);
        }
        System.out.println(Arrays.toString(x));


//sub-task3
        System.out.println("_________Print sum of all elements(initial array)_________");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum is " +sum);

//sub-task4
        System.out.println("_________Print max element(initial array)_________");
        int max = arr[0];
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);


    }

    }

