import java.io.*;
import java.util.*;
class Q23PriorityQueueDemo {
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(15);
		pQueue.add(20);
		pQueue.add(12);
    pQueue.add(80);
    pQueue.add(55);
  System.out.println("iterating the PriorityQueue elements:");
Iterator itr=pQueue.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

		// Printing the top element of PriorityQueue
		System.out.println("top element of priority queue is "+pQueue.peek());
}
}
