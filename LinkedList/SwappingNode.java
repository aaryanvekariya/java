package LinkedList;
// LeetCode 2095. Delete the Middle Node of a Linked List
// File: SwappingNode.java

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class SwappingNode {

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.println("Before swapping:");
        printList(head);

        head = swapNodes(head, k);

        System.out.println("After swapping:");
        printList(head);
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head, fast = head;

        // Move fast to the k-th node
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }

        ListNode first = fast;

        // Move fast to the end and slow to the (n-k+1)th node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Swap values
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
