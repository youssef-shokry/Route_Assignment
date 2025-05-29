package week_2;
import java.util.Scanner;

public class Solved_Assignment_Functions_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.close();
        System.exit(0);
    }
}
//1- Write a function getSummation that takes array as parameter and returns
// summation of its elements
/*
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

        for (int i: arr) sum += i;
        return sum;
    }


//2- Write a function getNumOfElements that takes array as parameter and
// returns the number of its elements
/*
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 2, 3, 5, 8, 9};

        int numberOfElements = getNumOfElements(arr);
        System.out.println(numberOfElements);

        scanner.close();
        System.exit(0);
    }
    public static int getNumOfElements(int [] arr){
        int numberOfElements = 0;
        for (int i = 0; i < arr.length; i++)
        {
            numberOfElements++;
        }
        return numberOfElements;
    }
}
*/

//3- Write a function getMax that takes array as parameter and returns the max
// value in the array
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int maxNumber = getMax(arr);
        System.out.println(maxNumber);

        scanner.close();
        System.exit(0);
    }
    public static int getMax(int [] arr){
       int max = arr[0];

       for (int i : arr) {
            if(i > max) max = i;
       }
       return max;
    }
 */

//4- Write a function getMin that takes array as parameter and returns the min
// value in the array
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int minNumber = getMin(arr);
        System.out.println(minNumber);

        scanner.close();
        System.exit(0);
    }
    public static int getMin(int [] arr){
       int min = arr[0];

       for (int i : arr) {
            if (i < min) min = i;
       }
       return min;
    }
 */

//5- Write a function CalculateEven that takes array as parameter and calculate
// the sum of even numbers and how many even numbers
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int sumOfEvens = CalculateEven(arr);
        System.out.printf("The sum of evens is: %d", sumOfEvens);

        scanner.close();
        System.exit(0);
    }
    public static int CalculateEven(int [] arr){
        int sumOfEvens = 0;
        int counter = 0;
        for (int i : arr)
        {
            if (i % 2 == 0)
            {
                sumOfEvens += i;
                counter++;
            }
        }
        System.out.printf("the number of even numbers is: %d", counter);
        System.out.println();

        return sumOfEvens;
    }
 */

//6- Write a function count2 that takes array as parameter and counts
// occurrences of number 2
/*
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int Count2 = count2(arr);
        System.out.println("number 2 occurred " + Count2 + " times");

        scanner.close();
        System.exit(0);
    }
    public static int count2(int [] arr){
        int counter = 0;
        for (int i : arr)
        {
            if ( i == 2) counter++;
        }

        return counter;
    }
*/

//7- Modify the above function to be CountGeneral that takes array as
// parameter and count occurrences of every number in the array and print it
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size of an array");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        CountGeneral(arr, size);

        scanner.close();
        System.exit(0);
    }
    public static void CountGeneral(int [] arr, int size) {
        int [] numbersInArr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            if (!LinearSearch(arr[i], numbersInArr))
            {
                int counter = 0;
                for (int j : arr) {
                    if (arr[i] == j) {
                        counter++;
                        numbersInArr[i] = arr[i];
                    }
                }
                System.out.println(arr[i] + " -> " + counter);
            }
        }
    }

    public static boolean LinearSearch(int value, int [] arr){
        for (int i : arr) {
            if (i == value) return true;
        }
        return false;
    }
 */

//8- Write function binary search that takes array and sorts it hint -> search about
// binary search
/*
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size of an array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < (arr.length - 1); i++) // couldn't make a pointer as c++ to sort the array in an external method
        {
            for (int j = i; j >= 0 && arr[j+1] < arr[j]; j--){
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.print("Enter an element you want to search for: ");
        int value = scanner.nextInt();

        boolean isFound = binarySearch(arr, value);
        if (isFound) {
            System.out.println("the element is found!");
        }
        else{
            System.out.println("there is no such element in the array");
        }

        scanner.close();
        System.exit(0);
    }

    public static boolean binarySearch(int[] arr, int value){
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == value) return true;

            if (arr[mid] < value) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }
*/

//9- search about selection sort and implement it in function SelectionSort that
//takes array as a parameter and sort it using the algorithm
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size of an array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        SelectionSearch(arr);

        scanner.close();
        System.exit(0);
    }

    public static void SelectionSearch(int[] arr) {
        for (int i = 0; i < (arr.length - 1); i++) {
            int min = i;
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[min] > arr[j]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int k : arr) System.out.print(k + " ");
    }
 */