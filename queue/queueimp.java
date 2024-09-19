package queue;

import java.util.*;
public class queueimp {
    int queue[];
    int front,rear,size;
    queueimp(int n){
        size=n;
        front=-1;
        rear=-1;
        queue=new int[size];
    }
    public void enqueue(int n){
        if(front==-1 || rear==-1){
            front=0;
            rear=0;
            queue[front]=n;
        }
        else{
            if(rear==size){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            queue[rear]=n;
        }
    }
    int dequeue(){
        if(front==-1){
            System.out.println("Queue is Empty");
            return -1;
        }
        int x=queue[front];
        front++;
        return x;
    }
    public void display(){
        System.out.println("Queue Elements");
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        queueimp m = new queueimp(n);
        m.enqueue(4);
        m.enqueue(14);
        m.enqueue(60);
        m.display();
        System.out.println(m.dequeue());
        m.display();
    }
}

