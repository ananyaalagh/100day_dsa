// Q1

import java.util.Scanner;

public class Day24{
static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static Node deletion(Node head, int key){
          if(head.data==key){
                    return head.next;
          }

          Node temp=head;
          Node prev=null;

          while(temp!=null){
                    if(temp.data==key){
                              prev.next=temp.next;
                              break;
                    }

                    prev=temp;
                    temp=temp.next;
          }
          return head;

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

        System.out.print("Enter key to delete: ");
        int key = sc.nextInt();

        head = deletion(head, key);

        System.out.print("Linked List after deletion: ");
        System.out.print(head);

        sc.close();
}}


// Q2
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode prev = null;
        ListNode temp = head;

        while(temp != null){

            if(temp.val == val){
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }

        return head;
    }
}