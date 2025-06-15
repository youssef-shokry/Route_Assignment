package week_2;
import java.util.Scanner;

public class nested_loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for(int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) { // j <= i (your code), j < i (right code)
                if(i % j == 0)
                {
                  isPrime = false;
                  break;
                }
            }
            if (isPrime)
            {
                System.out.println(i);
            }
        }

        scanner.close();
        System.exit(0);
    }
}
