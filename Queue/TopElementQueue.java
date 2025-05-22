import java.util.*;
public class TopElementQueue {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

       Queue<Integer> queue = new LinkedList<>();

    //    queue.add(30);
    //    queue.add(50);
    //    queue.add(60);
       
    //     for(int i =0;i<3;i++){
    //         int x = sc.nextInt();
    //         queue.add(x);
    //     }

    queue.offer(30);
    queue.offer(40);
    queue.offer(50);
    queue.offer(60);
    queue.offer(70);

    int topelement = queue.peek();
    int topelement1 = queue.element();
    System.out.println(topelement+" "+topelement1);

    int size = queue.size();
    System.out.println(size);

   int remove = queue.remove();
   System.out.println(remove);

   queue.poll();
   queue.poll();
   queue.poll();

    System.out.println(queue);
    }
}