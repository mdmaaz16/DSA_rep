package queue;
import java.util.*;


class stackuisngqueue
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    q1.add(a);
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty()){
	        return -1;
	    }
	    while(q1.size()!=1){
	        q2.add(q1.poll());
	    }
	    int val=q1.poll();
	   // int val=q2.poll();
	    while(!q2.isEmpty()){
	        q1.add(q2.poll());
	    }
	    return val;
    }
	
}