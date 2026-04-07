import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class LinkedList03 {

    static Node head = null;
    static Node tail = null;

    public static void insertion(int val) {
        Node value = new Node(val);
        if (head == null) {
            head = value;
            tail = value;
        } else {
            tail.next = value;
            tail = value;
        }
    }
    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void GetFromEnd(int idx) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < idx; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of linked list");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("enter the value of node");
            int val = sc.nextInt();
            insertion(val);
        }
        display();
        System.out.println();
        GetFromEnd(2);
    }
}
