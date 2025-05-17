package Wallmart;

/*
 * Problem Statement:
 * Remove One Element to Make the Array Strictly Increasing
Problem Statement:

Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.



The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length) .

Input Explanation:

The first line of input consists of an integer n, representing the number of elements in the array.
The second line of input consists of n space-separated integers, representing the elements of the array.
Output Explanation:

If the given array can be made strictly increasing after removing exactly one element, return true. Otherwise, return false.
Constraints:

2 <= nums.length <= 100
1 <= nums[i] <= 100

Time Limit:
1 sec

Example 1:
Input
5
1 2 10 5 7

Output
true

Example 2:
Input
4
2 3 1 2

Output
false

Sample I/O Explanation:

Example 1:

Explanation:

By removing 10 at index 2 from nums, it becomes [1,2,5,7]. [1,2,5,7] is strictly increasing, so return true.



Example 2:

Explanation:

[3,1,2] is the result of removing the element at index 0.

[2,1,2] is the result of removing the element at index 1.

[2,3,2] is the result of removing the element at index 2.

[2,3,1] is the result of removing the element at index 3.

No resulting array is strictly increasing, so return false.
 */
import java.util.Scanner;

public class RemoveElement {
    public boolean canBeIncreasing(int[] nums) {
        //Write your code here
        int count=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                count++;
                if(count > 1)
                    return false;
                    
                     if (i > 1 && i < nums.length - 1 && nums[i] <= nums[i - 2] && nums[i + 1] <= nums[i - 1]){
                         return false;
                     }
                }
            }
            return true;
        
    }
    
    //Do not edit this part of code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        RemoveElement sol = new RemoveElement();
        boolean result = sol.canBeIncreasing(nums);
        System.out.println(result ? "true" : "false");
    }
}
