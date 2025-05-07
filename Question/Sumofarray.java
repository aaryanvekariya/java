package Question;
import java.util.Scanner;
public class Sumofarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
               //sum of numbers in arry
            
            int arr[] = {5,37,54,1};
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                    sum += arr[i];
                }
            System.out.println(sum);


                   
    }
    
}
