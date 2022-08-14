public class Search {
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
}
