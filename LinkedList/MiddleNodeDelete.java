package LinkedList;
// LeetCode 2095. Delete the Middle Node of a Linked List

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class MiddleNodeDelete {
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        ListNode current = head;

        
        for (int i = 2; i <= 6; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        for (int i = 0; i < 5; i++) {
            head = deleteMiddle(head);
            printList(head);
        }
    }

    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        
        prev.next = slow.next;
        return head;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
