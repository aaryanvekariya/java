package Sorting;
import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];  // Declare and initialize the array
        
        // Read the elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort Algorithm
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // Swap arr[i] and arr[min]
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("======Sorted array=====");
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}
