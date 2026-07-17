
import java.util.Scanner;

// Q1

import java.util.LinkedList;
import java.util.Scanner;
public class Day21 {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);

              System.out.print("Enter the number of elements:");
              int n=sc.nextInt();

              LinkedList<Integer> list= new LinkedList<>();

              System.out.println("Enter the elements:");
              for(int i=0; i<n; i++){
                    list.add(sc.nextInt());
              }

              System.out.print("Linked list:"+list);
          }}

// Q2


import java.util.Scanner;

public class Day21 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to find middle node
    public static Node middleNode(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.print("Enter the elements: ");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Print Linked List
        System.out.print("Linked List: ");

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // Find Middle Node
        Node middle = middleNode(head);

        System.out.println("\nMiddle Element: " + middle.data);
    }
}