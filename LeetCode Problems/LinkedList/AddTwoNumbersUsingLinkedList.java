import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class AddTwoNumbersUsingLinkedList {

    // Method to add two numbers represented by linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next;
    }

    // Helper method to create a linked list from user input
    public static ListNode createLinkedList(Scanner sc, String name) {
        System.out.print("Enter the number of digits in " + name + ": ");
        int n = sc.nextInt();

        System.out.println("Enter digits in reverse order (least significant first):");
        ListNode head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int digit = sc.nextInt();
            ListNode newNode = new ListNode(digit);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Helper method to print a linked list
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first number
        ListNode l1 = createLinkedList(sc, "Number 1");

        // Input second number
        ListNode l2 = createLinkedList(sc, "Number 2");

        // Add numbers
        AddTwoNumbersUsingLinkedList solution = new AddTwoNumbersUsingLinkedList();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print result
        System.out.print("Result: ");
        printLinkedList(result);
    }
}
