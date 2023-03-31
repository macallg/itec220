package itec220.labs;

import java.util.ArrayList;
import java.util.NoSuchElementException;


@SuppressWarnings("unused")
public class QueueList<Item>  implements Queue<Item> {

	private Link<Item> head;
	private Link<Item> tail;
	private int count = 0;
	
	/////////////////////// Link Class
	private static class Link<Item>
	{			
		public Link<Item> next;
		public Item data;
		
		public Link(Link<Item> next, Item data) {
			super();
			this.next = next;
			this.data = data;
		}
		public Link(Item data) {
			super();
			this.next = null;
			this.data = data;
		}
		public Link() {
			super();
			this.next = null;
			this.data = null;
		}

	}// Link Class End
	
	@Override
	public void enqueue(Item element) {
		if(size() == 0) {
			Link<Item> l = new Link<Item>(element);
			head = l;
			tail = l;
		} 
		else {
			Link<Item> l = new Link<Item>(element);
			tail.next = l;
			tail = l;
		}
		count++;
	}	

	@Override
	public void clear() {
		Link<Item> l = new Link<Item>();
		
		head = l;
		tail = l;
		count = 0;
	}

	@Override
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		
		return false;
	
	}

	@Override
	public Item peek() {
		if(count == 0) {
			throw new NoSuchElementException();
		}
		return head.data;
	}

	@Override
	public Item dequeue() {
		if(count == 0) {
			throw new NoSuchElementException();
		}
		Link<Item> l = head;
		head = l.next;
		count--;
		return l.data;
	}

	@Override
	public int size() {
		
		return count;
	}

	@Override
	public ArrayList<Item> toArrayList() {
		ArrayList<Item> array = new ArrayList<Item>();
		Link<Item> current = head;
		while(current != null) {
			array.add(current.data);
			current = current.next;
		}
		return array;
	}
	
	@Override
	public String toString() {
		return String.format("This Queue has %s items: %s", count, toArrayList());
	}

}
