package Question;

public class ProductofArray {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Initialize the result array
        result[0] = 1;
        
        // First pass: calculate the prefix product for each element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Second pass: calculate the suffix product and multiply with the prefix product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result; // Return the result array
    }

    // You can add a main method to test the solution if needed
    public static void main(String[] args) {
        ProductofArray solution = new ProductofArray();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        
        // Print the result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
