package Wallmart;
/*
 * Problem Statement:
 * Non-decreasing Array
Problem Statement:

Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.



We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2) .

Input Explanation:

The first line of input consists of an integer n, representing the size of the array numbers.
The second line of input consists of n integers separated by space nums[i], representing the elements of the array numbers.
Output Explanation:

The first output displays the space-separated integers, representing the input array.
The second output displays a single line containing "true" if it is possible to make the array non-decreasing by modifying at most one element, and "false" otherwise.
Constraints:

1 ≤ n ≤ 10
1 ≤ nums[i] ≤ 109

Time Limit:
1 sec

Example 1:
Input
3
4 2 3

Output
4 2 3
true

Example 2:
Input
3
4 2 1

Output
4 2 1
false


Sample I/O Explanation:

Example 1:

Explanation: You could modify the first 4 to 1 to get a non-decreasing array.



Example 2:

Explanation: You cannot get a non-decreasing array by modifying at most one element.
 */
import java.util.Scanner;

public class NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        //Write your code here//
        if(nums[nums.length-2]==nums[nums.length-1]-1){
            return true;
        }
        else 
        {
            return false;
        }
        
    }    


    //Do not edit this part of code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Print the input array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
                System.out.print(" ");
        }
        System.out.println();

        boolean result = checkPossibility(nums);
        System.out.println(result ? "true" : "false");
    }
}
