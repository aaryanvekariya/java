package Queue;
import java.util.*;

public class Queue1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        queue.add(30);
        queue.add(50);
        queue.add(60);
       
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            queue.add(x);
        }

        queue.offer(30);
        queue.offer(40);

        System.out.println(queue);
    }
}
