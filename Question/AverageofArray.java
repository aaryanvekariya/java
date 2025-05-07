package Question;

public class AverageofArray {
    public static void main(String[] args) {
        // Average of array
        int arr[] = {5, 37, 54, 1};
        int sum = 0;
        
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        
        double avg = (double) sum / arr.length;

        
        System.out.println(avg);
    }
}