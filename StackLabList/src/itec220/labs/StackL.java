package itec220.labs;
import java.util.EmptyStackException;


public class StackL<Object> implements StackInterface<Object>{

	private int count = 0;
	private Node<Object> head;
	private Node<Object> tail;
	
	public StackL() {
		Node<Object> node = new Node<Object>();
		head = node;
		tail = node;
	}

	@Override
	public void push(Object item) {
		
		if(count == 0) {
			Node<Object> n = new Node<Object>(item);
			head = n;
			tail = n;
		}
		else {
			Node<Object> n = new Node<Object>(item, head);
			head = n;
		}
		count++;
	}

	@Override
	public Object pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		count--;
		Node<Object> n = head;
		head = head.next;
		return n.data;
	}

	@Override
	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return head.data;
	}

	@Override
	public boolean isEmpty() {
		if(count <= 0) {
			return true;
		}
		return false;
	}

	@Override
	public void makeEmpty() {
		Node<Object> n = new Node<Object>();
		head = n;
		tail = n;
		count = 0;
	}

	@Override
	public int size() {
		return count;
	}
	
	private static class Node<Object>{
		public Object data;
		public Node<Object> next;
		
		public Node(Object data, Node<Object> next) {
			super();
			this.data = data;
			this.next = next;
		}
		public Node(Object data) {
			super();
			this.data = data;
			this.next = null;
		}
		public Node() {
			super();
			this.data = null;
			this.next = null;
			
		}
	}
}




