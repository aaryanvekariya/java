package LinkedList;

import java.util.*;
public class Staticlist {

    static class Node {
        int data;
        int next; // using index instead of reference

        Node(int data) {
            this.data = data;
            this.next = -1; // -1 means null
        }
    }

    static Node[] nodes = new Node[100]; // static array of nodes
    static int head = -1;
    static int index = 0;

    // insert at start
    public static void insertstarting(int data) {
        nodes[index] = new Node(data);
        nodes[index].next = head;
        head = index;
        index++;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // manually insert 3 nodes like your original example
        insertstarting(30);
        insertstarting(20);
        insertstarting(10);

        int temp = head;
        while (temp != -1) {
            System.out.println(nodes[temp].data);
            temp = nodes[temp].next;
        }
    }
}
