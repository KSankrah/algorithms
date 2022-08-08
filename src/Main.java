import java.util.*;
import java.lang.*;

public class Main {
    // Linear Search
    public static int linearSearch(int[] arr, int x) {
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Hello, welcome to the Algorithm Tester!
                =======================================
                
                What type of algorithm would you like to implement
                ( 1 ) Search Algorithm
                ( 2 ) Sorting Algorithm
                
                """);
        int algoOption = sc.nextInt();

        if (algoOption == 1){
            System.out.println("""
                    Here are the available Search Algorithms.
                    ( 1 ) Linear Search
                    ( 2 ) Binary Search
                    """);
            int searchOption =sc.nextInt();

            if (searchOption == 1) {
                System.out.println("\nEnter 10 numbers separated with ONLY a space");

                int[] nums = new int[10];
                int i;

                // Loop to store input values in nums array
                for (i = 0; i < nums.length; i++) {
                    nums[i] = sc.nextInt();
                }

                System.out.println("\nEnter the number you want to search for");

                int searchValue = sc.nextInt();

                int answer = linearSearch(nums, searchValue);

                if ( answer == -1) {
                    System.out.println("\nElement is not present in list");
                }
                else {
                    System.out.println("\nElement is present at index " + answer);
                }
            }
        }
        else if (algoOption == 2) {
            System.out.println("""
                    Here are the available Sorting Algorithms
                    
                    ( 1 ) Heap Sort
                    ( 2 ) Merge Sort
                    ( 3 ) Radix Sort
                    ( 4 ) Quick Sort
                    """);
        }
        else {
            System.out.println("Enter a valid input");
        }
    }
}