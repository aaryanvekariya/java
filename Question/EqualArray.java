package Question;

public class EqualArray {
    public static void main(String[] args) {
        int arr1[] = {5, 37, 54, 1};
        int arr2[] = {5, 37, 54, 1};
        
        boolean areEqual = true;
        
        if (arr1.length != arr2.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        
        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
    
}
