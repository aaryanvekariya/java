package Question;

public class SearchofArray {
    public static void main(String[] args) {
        // Search of array
        int arr[] = {5, 37, 54, 1};
        int search = 54;
        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
}
