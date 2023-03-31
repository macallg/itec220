package itec220.labs;



public class Main {

	public static void main(String[] args) {
		QueueList<String> q = new QueueList<String>();
		 q.enqueue("1");
		 
		    // Permutation using a Queue
		    // run `n` times
		    int i = 1;
		    while (i++ <= 15)
		    {
		        // append 0 and 1 to the front element of the queue and
		        // enqueue both strings
		        q.enqueue(q.peek() + "0");
		        q.enqueue(q.peek() + "1");
		 
		        // dequeue front element after printing it
		       System.out.println(q.dequeue());
		    }
		    
		    q.clear();
		    q.enqueue("Hello");
		    q.enqueue("How");
		    q.enqueue("Are");
		    q.enqueue("You");
		    q.enqueue(q.dequeue());
		    
		    System.out.println(q.toString());

	}

}
