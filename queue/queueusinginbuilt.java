package queue;



import java.util.LinkedList;
import java.util.Queue;

public class queueusinginbuilt {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue (add elements to the queue)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue after enqueue operations: " + queue);

        // Dequeue (remove an element from the queue)
        int removedElement = queue.poll(); // poll() retrieves and removes the head of the queue
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Queue after dequeue operation: " + queue);

        // Peek (retrieve the head of the queue without removing it)
        int head = queue.peek(); // peek() retrieves the head of the queue without removing it
        System.out.println("Head of the queue: " + head);
        System.out.println("Queue after peek operation: " + queue);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);
    }
}
