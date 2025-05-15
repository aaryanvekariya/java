package Sorting;
import java.util.Scanner;
class BubbleSort {
    // Bubble Sort Algorithm
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Stable Sort
    // In-place sorting algorithm

    // This is a simple implementation of the bubble sort algorithm in Java.
    // It sorts an array of integers in ascending order.

    // The algorithm repeatedly steps through the list, compares adjacent elements,
    // and swaps them if they are in the wrong order. The pass through the
public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
            System.out.println("=======After Sorting=======");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
}    