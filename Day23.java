
import java.util.Scanner;

// Q1
public class Day23 {
          static class Node{
                 int data;
                 Node next;

                 Node(int data){
                    this.data=data;
                    this.next=null;
                 }
          }

        //   Function to merge
        public static Node merge(Node head1, Node head2){
            Node dummy=new Node(-1);
            Node tail=dummy;

             while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next;
    }


    // Function to print 
    public static void print(Node head){
                 Node temp=head;

                 while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                 }

                 System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of elements for list1:");
        int n=sc.nextInt();

        Node head1=null;
        Node tail1=null;
         System.out.print("Enter elements (sorted): ");
        for(int i=0; i<n; i++){
            int x=sc.nextInt();

            Node newNode=new Node(x);
            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        
        }

        System.out.print("Enter number of nodes in second linked list: ");
        int n2 = sc.nextInt();

        Node head2 = null;
        Node tail2 = null;

        System.out.print("Enter elements (sorted): ");

        for (int i = 0; i < n2; i++) {

            int x = sc.nextInt();

            Node newNode = new Node(x);

            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        System.out.print("\nFirst Linked List : ");
        print(head1);

        System.out.print("Second Linked List: ");
        print(head2);

        Node merged = merge(head1, head2);

        System.out.print("Merged Linked List: ");
        print(merged);

    }}



// Q2
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;

       while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;

    if(fast==slow){
        return true;
    }}

    return false;



    }
}
    


