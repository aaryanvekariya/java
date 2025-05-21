package Stack;
import java.util.Scanner;
import java.util.Stack;

public class stack2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);

        // Optional: Take input
        // int x = scanner.nextInt();
        // stack.push(x);
        // for (int i = 0; i < 2; i++) {
        //     int y = scanner.nextInt();
        //     stack.push(y);
        // }

        int top = stack.peek();     // Get top element
        int length = stack.size();  // Get size of stack

        System.out.println(length);
       

        scanner.close();
    }
}
