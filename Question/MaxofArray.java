package Question;

public class MaxofArray {
    public static void main(String[] args) {
        // Maximum of array
        int arr[] = {5, 37, 54, 1};
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println(max);
    }
    
}
