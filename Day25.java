// Q1     

import java.util.Scanner;

public class Day25 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to count occurrences
    public static int counting(Node head, int key) {

        Node temp = head;
        int count = 0;

        while (temp != null) {

            if (temp.data == key) {
                count++;
            }

            temp = temp.next;
        }

        return count;
    }

    // Function to print the linked list
    public static void print(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
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

        System.out.print("Enter the key to count: ");
        int key = sc.nextInt();

        System.out.print("Linked List: ");
        print(head);

        int ans = counting(head, key);

        System.out.println("Occurrences of " + key + " = " + ans);

        sc.close();
    }
}


// Q2


public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
            
        }
        return null;
    }
}