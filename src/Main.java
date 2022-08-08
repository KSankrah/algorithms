import java.util.*;
import java.lang.*;

public class Main {
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
            System.out.println("Search Algorithmssssss");
        }
        else if (algoOption == 2) {
            System.out.println("Sorting Algorithmssssss");
        }
        else {
            System.out.println("Enter a valid input");
        }
    }
}