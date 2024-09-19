package linkedlist;

// // Node class for the LinkedList
// class Node {
//     int data;
//     Node next;

//     // Constructor
//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// // LinkedList class
// class LinkedList {
//     Node head;

//     // Constructor
//     public LinkedList() {
//         this.head = null;
//     }

//     // Method to add a new node at the end of the list
//     public void append(int data) {
//         if (head == null) {
//             head = new Node(data);
//         } else {
//             Node current = head;
//             while (current.next != null) {
//                 current = current.next;
//             }
//             current.next = new Node(data);
//         }
//     }

//     // Method to print the linked list
//     public void printList() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     // Method to delete a node by value
//     public void delete(int value) {
//         if (head == null) return;

//         if (head.data == value) {
//             head = head.next;
//             return;
//         }

//         Node current = head;
//         while (current.next != null && current.next.data != value) {
//             current = current.next;
//         }

//         if (current.next != null) {
//             current.next = current.next.next;
//         }
//     }

//     // Method to find a node by value
//     public boolean contains(int value) {
//         Node current = head;
//         while (current != null) {
//             if (current.data == value) {
//                 return true;
//             }
//             current = current.next;
//         }
//         return false;
//     }
// }

// // Main class to test the LinkedList
// public class implementation {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
        
//         // Adding elements to the list
//         list.append(1);
//         list.append(2);
//         list.append(3);
//         list.append(4);
        
//         // Printing the list
//         System.out.println("Linked List:");
//         list.printList();
        
//         // Deleting an element
//         list.delete(3);
//         System.out.println("After deleting 3:");
//         list.printList();
        
//         // Checking if an element exists
//         System.out.println("Contains 2: " + list.contains(2));
//         System.out.println("Contains 3: " + list.contains(3));
//     }
// }

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head = null;
    }
    void append(int data){
        if(head==null){
            head = new Node(data);
        }
        else{
            Node curr  = head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            Node newnode = new Node(data);
            curr.next = newnode;
        }
    }
    void printlist(){
        if(head.next==null){
            System.out.print("List is Empty");
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
}

class implementation{
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.append(4);
        l.append(7);
        l.append(2);
        l.printlist();
    }
}