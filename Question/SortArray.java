package Question;
public class SortArray {
    public static void main(String[] args) {
        int arr[] = {5, 37, 54, 1};
        int temp;
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 2nd Methos to sort the array
    
    // int a1[] = {10,52,487,123,4569,15,12,2,25,46,1,5};
    // Arrays.sort(a1);
    // System.out.print(Arrays.toString(a1));
}

