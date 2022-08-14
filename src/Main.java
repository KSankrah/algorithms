import java.util.*;
import java.lang.*;


public class Main {
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

            switch (algoOption) {
                case 1 -> {
                    System.out.println("""
                            Here are the available Search Algorithms.
                            ( 1 ) Linear Search
                            ( 2 ) Binary Search
                            """);
                    int searchOption = sc.nextInt();
                    switch (searchOption) {
                        case 1 -> {
                            System.out.println("\nEnter 10 numbers separated with ONLY a space");
                            int[] nums = new int[10];
                            int i;
                            // Loop to store input values in nums array
                            for (i = 0; i < nums.length; i++) {
                                nums[i] = sc.nextInt();
                            }
                            System.out.println("\nEnter the number you want to search for");
                            int searchValue = sc.nextInt();
                            int answer = Search.linearSearch(nums, searchValue);
                            if (answer == -1) {
                                System.out.println("\nElement is not present in list");
                            } else {
                                System.out.println("\nElement is present at index: " + answer);
                            }
                        }
                        case 2 -> {
                            System.out.println("\nEnter 10 numbers separated with ONLY a space");
                            int[] numbers = new int[10];
                            int j;
                            int last = numbers.length - 1;

                            // Loop to store input values in nums array
                            for (j = 0; j < numbers.length; j++) {
                                numbers[j] = sc.nextInt();
                            }
                            System.out.println("\nEnter the number you want to search for");
                            int searchKey = sc.nextInt();
                            int result = Search.binarySearch(numbers, 0, last, searchKey);
                            if (result == -1)
                                System.out.println("Element is not found!");
                            else
                                System.out.println("Element is found at index: " + result);
                        }
                        default -> System.out.println("You did not enter a valid input.");
                    }
                }
                case 2 -> {
                    System.out.println("""
                            Here are the available Sorting Algorithms
                                                
                            ( 1 ) Heap Sort
                            ( 2 ) Merge Sort
                            ( 3 ) Radix Sort
                            ( 4 ) Quick Sort
                            ( 5 ) Bubble Sort
                            ( 6 ) Insertion Sort
                            ( 7 ) Selection Sort
                            """);
                    int sortOption = sc.nextInt();
                    switch (sortOption) {
                        case 1 -> System.out.println("Heap Sort!");
                        case 2 -> System.out.println("Merge Sort!");
                        case 3 -> System.out.println("Radix Sort!");
                        case 4 -> System.out.println("Quick Sort!");
                        case 5 -> System.out.println("Bubble Sort!");
                        case 6 -> System.out.println("Insertion Sort!");
                        case 7 -> System.out.println("Selection Sort!");
                    }
                }
                default -> System.out.println("Enter a valid input");
            }
        }
    }
    //Heap Sort//        
    class HeapSort  
            {  
            /* function to heapify a subtree. Here 'i' is the   
            index of root node in array a[], and 'n' is the size of heap. */   
            static void heapify(int a[], int n, int i)  
            {  
                int largest = i; // Initialize largest as root  
                int left = 2 * i + 1; // left child  
                int right = 2 * i + 2; // right child  
                // If left child is larger than root  
                if (left < n && a[left] > a[largest])  
                    largest = left;  
                // If right child is larger than root  
                if (right < n && a[right] > a[largest])  
                    largest = right;  
                // If root is not largest  
                if (largest != i) {  
                    // swap a[i] with a[largest]  
                    int temp = a[i];  
                    a[i] = a[largest];  
                    a[largest] = temp;  
                      
                    heapify(a, n, largest);  
                }  
            }  
            /*Function to implement the heap sort*/  
            static void heapSort(int a[], int n)  
            {  
                for (int i = n / 2 - 1; i >= 0; i--)  
                    heapify(a, n, i);  
              
                // One by one extract an element from heap  
                for (int i = n - 1; i >= 0; i--) {  
                    /* Move current root element to end*/  
                    // swap a[0] with a[i]  
                    int temp = a[0];  
                    a[0] = a[i];  
                    a[i] = temp;  
                      
                    heapify(a, i, 0);  
                }  
            }  
            /* function to print the array elements */  
            static void printArr(int a[], int n)  
            {  
                for (int i = 0; i < n; ++i)  
                    System.out.print(a[i] + " ");  
            }  
            public static void main(String args[])   
            {  
                int a[] = {45, 7, 20, 40, 25, 23, -2};  
                int n = a.length;  
                System.out.print("Before sorting array elements are - \n");  
                printArr(a, n);  
                heapSort(a, n);  
                System.out.print("\nAfter sorting array elements are - \n");  
                printArr(a, n);  
            }  
            }  

            System.out.println("Press any key to continue or press q to quit");
            String quit = sc.next();

            if (Objects.equals(quit, "q")) {
                hasQuit = true;
            }
        }


        System.out.println("Thanks for using this application!");

    }
}