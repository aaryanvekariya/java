package Question;

public class MinofArray {
    public static void main(String[] args) {
        // Minimum of array
        int arr[] = {5, 37, 54, 1};
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println(min);
    }
    
}
