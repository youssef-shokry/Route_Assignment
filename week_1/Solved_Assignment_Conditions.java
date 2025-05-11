package week_1;
import java.util.Scanner;

public class Solved_Assignment_Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        scanner.close();
        System.exit(0);
    }
}

//1- Write a java program that read a number of the months And then print the name of it
/*
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter a number to determine its equivalent month name: ")
        int MonthNumber = scanner.nextInt();

        switch (MonthNumber)
        {
            case 1 -> System.out.println("January");

            case 2 -> System.out.println("February");

            case 3 -> System.out.println("March");

            case 4 -> System.out.println("April");

            case 5 -> System.out.println("May");

            case 6 -> System.out.println("June");

            case 7 -> System.out.println("July");

            case 8 -> System.out.println("August");

            case 9 -> System.out.println("September");

            case 10 -> System.out.println("October");

            case 11 -> System.out.println("November");

            case 12 -> System.out.println("December");

            default -> System.out.println("There is now month with this number");
        }
        scanner.close();

*/
//2-  Write a java program that reads a number of the month and prints the month is in Summer, spring, winter or autumn.
/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to determine its equivalent month name and season: ");
        int MonthNumber = scanner.nextInt();

        switch (MonthNumber)
        {
            case 1 -> System.out.println("January and it's winter");

            case 2 -> System.out.println("February and it's winter");

            case 3 -> System.out.println("March and it's spring");

            case 4 -> System.out.println("April and it's spring");

            case 5 -> System.out.println("May and it's spring");

            case 6 -> System.out.println("June and it's summer");

            case 7 -> System.out.println("July and it's summer");

            case 8 -> System.out.println("August and it's summer");

            case 9 -> System.out.println("September and it's autumn");

            case 10 -> System.out.println("October and it's autumn");

            case 11 -> System.out.println("November and it's autumn");

            case 12 -> System.out.println("December and it's winter");

            default -> System.out.println("There is now month with this number");
        }
        scanner.close();
 */
//3- The alphabets A, E, I, O and U (small case and uppercase) are known as Vowels, and the rest of the
// alphabets are known as consonants. Here we will write a java program that checks whether the
// input character is vowel or Consonant.
/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char Letter = scanner.next().charAt(0);
        char LetterNormalization = Character.toLowerCase(Letter);

        if(LetterNormalization == 'a' || LetterNormalization == 'e' || LetterNormalization == 'i' || LetterNormalization == 'o' || LetterNormalization == 'u') System.out.println("It's a Vowel");

        else System.out.println("It's a constant");

        scanner.close();

*/
//4-In this Program we are making a simple calculator that performs addition, subtraction, multiplication
// and division based on the user input. The program takes the value of both the numbers (entered by
// user), and then user is asked to enter the operation (+, -, * and /), based on the input program
// performs the selected operation on the entered numbers
/*
        Scanner scanner = new Scanner(System.in);

        int Num1, Num2;
        System.out.print("Enter two number: ");
        Num1 = scanner.nextInt();
        Num2 = scanner.nextInt();

        System.out.print("Enter the operation you want to make: ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') System.out.println(Num1 + Num2);

        else if (operator == '*') System.out.println(Num1 * Num2);

        else if (operator == '/') System.out.println(Num1 / Num2);

        else if (operator == '-') System.out.println(Num1 - Num2);
        scanner.close();
 */
//5-  Write a Java program to get a number from the user and print whether it is positive or negative
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();

        if (num > 0) System.out.println("Number is positive");

        else if(num < 0) System.out.println("Number is Negative");

        else System.out.println("Number is Zero");

        scanner.close();
 */
//6-  Write a program which calculates marks on the basis of given grades in java using switch statement
// if Grade A then marks >=80
// if Grade B then marks >=60 and less than 80
// if Grade C then marks >=40 and less than 60
//if Grade F then marks <=40
// if any other grade is passed then print invalid grade
/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int Mark = scanner.nextInt();

        if (Mark >= 80)
            System.out.println("Your Grade is A");
        else if (Mark >= 60)
            System.out.println("Your Grade is B");
        else if (Mark >= 40)
            System.out.println("Your Grade is C");
        else if (Mark >= 0)
            System.out.println("Your Grade is C");
        else
            System.out.println("Invalid grade");
        scanner.close();

 */
//7- Watermelon
/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weigh of the watermelon: ");
        int Weigh = scanner.nextInt();

        if (Weigh % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

 */
//8- SortingThreeFloatingNumbers
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        if(number1 > number2 && number1 > number3)
        {
            if (number2 > number3)
            {
                System.out.println(number3);
                System.out.println(number2);
                System.out.println(number1);
            }
            else{
                System.out.println(number2);
                System.out.println(number3);
                System.out.println(number1);
            }
        }
        else if(number2 > number1 && number2 > number3)
        {
            if (number1 > number3)
            {
                System.out.println(number3);
                System.out.println(number1);
                System.out.println(number2);
            }
            else{
                System.out.println(number1);
                System.out.println(number3);
                System.out.println(number2);
            }
        }
        else
        {
            if (number1 > number2)
            {
                System.out.println(number2);
                System.out.println(number1);
                System.out.println(number3);
            }
            else{
                System.out.println(number1);
                System.out.println(number2);
                System.out.println(number3);
            }
        }

        scanner.close();
        System.exit(0);
 */
//9- min and max
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        if(number1 > number2 && number1 > number3)
        {
            System.out.println("Max= " + number1);
            if (number2 > number3)
            {
                System.out.println("Min= " + number3);
            }
            else{
                System.out.println("Min= " + number2);
            }
        }
        else if(number2 > number1 && number2 > number3)
        {
            System.out.println("Max= " + number2);
            if (number1 > number3)
            {
                System.out.println("Min= " + number3);
            }
            else{
                System.out.println("Min= " + number1);
            }
        }else if(number3 > number2 && number3 > number1)
        {
            System.out.println("Max= " + number3);
            if (number1 > number2)
            {
                System.out.println("Min= " + number2);
            }
            else{
                System.out.println("Min= " + number1);
            }
        }

        scanner.close();
        System.exit(0);
 */
/*
10- what is the value of x,y,z and w
        int x = 3;
        int y = 2;
        int z = x++; // z = 3 , x = 4
        int w = ++y; // y = 3 , w = 3
*/
//11- .write a program to calculate the sum of positive integers and sum of negative integers for 6 integers.
// Example:
/*
        Scanner scanner = new Scanner(System.in);

        int sumOFPositive = 0, sumOfNegative = 0;

        for (int i = 1; i <= 6; i++)
        {
            int number = scanner.nextInt();

            if (number > 0)
                sumOFPositive += number;
            else if (number < 0)
                sumOfNegative += number;
        }
        System.out.println("Sum of positive integers: " + sumOFPositive);
        System.out.println("Sum of Negative Integers: " + sumOfNegative);

        scanner.close();
        System.exit(0);
*/
//12- ake three numbers from the user and print the greatest number
/*
        Scanner scanner = new Scanner(System.in);

        int Max = -2147483648;

        for (int i = 1; i <= 3; i++)
        {
            int number = scanner.nextInt();
            if (number > Max) Max = number;
        }
        System.out.println("The greatest: " + Max);

        scanner.close();
        System.exit(0);
 */
//13- Write a Java program to print the area of a circle.
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Radius: ");
        double Radius = scanner.nextDouble();

        System.out.println(Math.PI * Math.pow(Radius, 2));

        scanner.close();
        System.exit(0);

 */
