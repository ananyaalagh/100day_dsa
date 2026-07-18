// Q1

// import java.util.LinkedList;
// import java.util.Scanner;

// public class Day22 {
//            public static void main(String[] args) {
//                Scanner sc=new Scanner(System.in);

//                System.out.print("The number of elements in linkedlist:");
//                int n=sc.nextInt();

//                LinkedList<Integer> list= new LinkedList<>();
//           System.out.print("\n");
//                System.out.print("Enter the elements");
//                int count=0;
//                for(int i=0; i<n; i++){
//                     list.add(sc.nextInt());
//                     count++;
//                }

//           System.out.print("\n");
//           System.out.print("Link list:"+list);
//           System.out.print("\n");
//           System.out.print("Number of nodes:"+count);
          
          


//            }}


          //  Q2

import java.util.Scanner;

public class Day22{
static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head) {
          Node prev=null;
          Node curr=head;
          Node next=null;

          while(curr!=null){
                    next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
          }
          return prev;
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

        // Print Original Linked List
        System.out.print("\nOriginal Linked List: ");

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // Reverse Linked List
        head = reverse(head);

        // Print Reversed Linked List
        System.out.print("\nReversed Linked List: ");

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
          
              
}
          
          

