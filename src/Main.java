import java.util.*;
import java.lang.*;

public class Main {
    // Linear Search
    public static int linearSearch(int[] arr, int x) {
        int arrLength = arr.length;

        // Loop through array to find a match for x
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (using recursion)
    public static int binarySearch(int[] arr, int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearch(arr, first, mid-1, key); //search in left subarray
            }else{
                return binarySearch(arr, mid+1, last, key); //search in right subarray
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasQuit = false;

        while (!hasQuit) {
            System.out.println("""
                Hello, welcome to the Algorithm Tester!
                =======================================
                
                What type of algorithm would you like to implement
                ( 1 ) Search Algorithms
                ( 2 ) Sorting Algorithms
                
                """);
            int algoOption = sc.nextInt();

            if (algoOption == 1){
                System.out.println("""
                    Here are the available Search Algorithms.
                    ( 1 ) Linear Search
                    ( 2 ) Binary Search
                    """);
                int searchOption = sc.nextInt();

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
                        System.out.println("\nElement is present at index: " + answer);
                    }
                }
                else if (searchOption == 2) {
                    System.out.println("\nEnter 10 numbers separated with ONLY a space");

                    int[] nums = new int[10];
                    int i;
                    int last = nums.length - 1;

                    // Loop to store input values in nums array
                    for (i = 0; i < nums.length; i++) {
                        nums[i] = sc.nextInt();
                    }

                    System.out.println("\nEnter the number you want to search for");

                    int searchValue = sc.nextInt();

                    int answer = binarySearch(nums, 0, last, searchValue);

                    if (answer == -1)
                        System.out.println("Element is not found!");
                    else
                        System.out.println("Element is found at index: "+ answer);
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


            System.out.println("Press any key to continue or press q to quit");
            String quit = sc.next();

            if (Objects.equals(quit, "q")) {
                hasQuit = true;
            }
        }




    }
}