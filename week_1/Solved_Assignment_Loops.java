package week_1;
import java.util.Scanner;

public class Solved_Assignment_Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        scanner.close();
        System.exit(0);
    }
}
//1- A program to print numbers divisible by 5, for the integers from 1 to 99

/*
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 99; i++){
            if (i % 5 == 0) System.out.println(i);
        }

        scanner.close();
        System.exit(0);
 */

// 2- Your program prints the numbers from one up to 100 in ascending order

/*
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 100; i++) System.out.println(i);

        scanner.close();
        System.exit(0);

 */

//3- Repeat question 2 for a descending order
/*
        Scanner scanner = new Scanner(System.in);

        for(int i = 100; i >= 1; i--) System.out.println(i);
        scanner.close();
        System.exit(0);

 */
//4- You take two numbers from the user, base and power The output: Base ^ power
/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a base: ");
        int base = scanner.nextInt();

        System.out.print("Enter a power: ");
        int power = scanner.nextInt();

        int result = 1;

        For (int i = 1; i <= power; i++)
        {
            result *= base;
        }
        System.out.println(result);

        //Math.pow(base, power);

        scanner.close();
        System.exit(0);
 */
//5-  You will take number from the user to Write a java program to print its factorial.
/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Number = scanner.nextInt();

        int Factorial = 1;

        For (int i = Number; i >= 1; i--)
        {
            Factorial *= i;
        }
        System.out.println(Factorial);



        scanner.close();
        System.exit(0);

 */
// program to display the following sequence of numbers: 7 14 21 28 35 42 49 56
// 63 70 77 84 91 98
/*
        for (int i = 1; i <= 14; i++) System.out.println(7 * i);
*/
//Program to display the following sequence of numbers: 1 2 4 8 16 32 64 128 256
// 512
/*
        int number = 1;
        System.out.println(number);

        while (number < 512)
        {
            number *= 2;
            System.out.println(number);
        }

 */
//8- Write an application that calculates the product of the odd integers from 1 to 15.
/*
        Int product = 1;
        for (int i = 15; i >= 1; i--)
        {
            if (i % 2 != 0) product *= i;
        }

        System.out.println(product);
 */
//9- Write a java program that reads positive numbers from user Until read a negative
// number … then calculate and print The average of these numbers.
/*
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0, sum = 0;
        int number;

        Do
        {
            number = scanner.nextInt();
            if (number < 0) break;

            Sum += number;
            totalNumbers++;

            System.out.println("Number: " + number);
            System.out.println("Sum: " + sum);
            System.out.println("totalNumber: " + totalNumbers);
        }while (true);

        System.out.println("Average: " + (sum / totalNumbers));


        scanner.close();
        System.exit(0);

 */
//10- Write java program to read integer from user then the print sum of digits means add
// all the digits of any number, for  example, if user enter 123 .output is 6 because 1 +2
// +3 = 6 and so on
/*
        Scanner scanner = new Scanner(System.in);

        int sum = 0, digit;
        int number = scanner.nextInt();

        for(int i = 10; number != 0;)
        {
            digit = number % i;
            sum += digit;
            number /= i;
        }

        System.out.println(sum);

        scanner.close();
        System.exit(0);

 */
//11-  Write java program to read an integer from a user then print how many digits in
// this number
/*

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int number = scanner.nextInt();

        for (int i = 10; number != 0; )
        {
            counter++;
            number /= i;
        }
        System.out.println(counter);

        scanner.close();
        System.exit(0);

 */
//12-  Given a number, print how many times can we divide it by 2?
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number: ");
        int number = scanner.nextInt(), counter = 0;

        for(int i = 1; i <= number; i++)
        {
            if (number % 2 == 0)
            {
                counter++;
                number /= 2;
            }
        }

        System.out.println(counter);
 */
//13- Write a program that displays all the numbers from 100 to
// 200, ten per line, that are divisible by 5 or 6, but not both.
// Numbers are separated by exactly one space
/*
        Scanner scanner = new Scanner(System.in);
        int counter = 0;


        For (int i = 100; i <= 200; i++)
        {
            if(i % 5 == 0 || i % 6 == 0)
            {
                System.out.print(i + " ");
                counter++;
                if (counter % 10 == 0) System.out.print("\n");
            }
        }

        scanner.close();
        System.exit(0);

*/