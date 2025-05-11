package week_2;
import java.util.Scanner;

public class Solved_Assignment_Functions_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int sum = getSummation(arr);
        System.out.println(sum);

        scanner.close();
        System.exit(0);
    }

    public static int getSummation(int [] arr){
        int sum = 0;

        for (int i : arr) sum += i;
        return sum;
    }
}

