package Question;

public class ReversedArray {
    public static void main(String[] args) {
        int arr[] = {5,37,54,1};
            int RevArr [] = new int[arr.length];
            for(int i = arr.length-1;i>=0;i--){
                RevArr[i] = arr[arr.length - 1 - i];
            }
            for(int i=0;i<RevArr.length;i++){
                System.out.println(RevArr[i]);
            }
    }
    
}   
