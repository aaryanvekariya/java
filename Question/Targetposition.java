package Question;

public class Targetposition {
    // Leetcode 34: Find first and last position of element in sorted array
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] result = {-1, -1};
            if (nums.length == 0) return result;

            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                if (nums[left] != target) {
                    left++;
                } else if (nums[right] != target) {
                    right--;
                } else {
                    result[0] = left;
                    result[1] = right;
                    break;
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Targetposition obj = new Targetposition();
        Solution sol = obj.new Solution();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 10;

        int[] result = sol.searchRange(nums, target);
        System.out.println("First and last position of target: " + result[0] + ", " + result[1]);
    }
}
