package Stack;
import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        int x=scanner.nextInt();
        stack.push(x);
        for(int i=0; i<2; i++){
            int y =scanner.nextInt();
            stack.push(y);
        }
        System.out.println(stack);
        
    }
}
