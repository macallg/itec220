package itec220.labs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.Test;

class testStack {

	@Test
	void testSizeOnEmptyStack() {
		
		StackL<Integer>  test = new StackL<Integer> ();
		int actual =  test.size();
		int expected = 0;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testSizeOnStackAfterPush() {
		
		StackL<Integer>  test = new StackL<Integer> ();
		test.push(0);
		int actual =  test.size();
		int expected = 1;
		assertEquals(expected, actual);
		
	}
	@Test
	void testSizeOnStackAfter2PushPop() {
		
		StackL<Integer>  test = new StackL<Integer> ();
		test.push(0);
		test.push(1);
		test.pop();
		int actual =  test.size();
		int expected = 1;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testPeekOnEmptyStack() {
		
		StackL<Integer>  test = new StackL<Integer> ();
		
		assertThrows(EmptyStackException.class, () -> { test.peek();});	  		
		
		
	}
	
	
	@Test
	void testPeekOnStackAfter2PushPop() {		
		StackL<Integer> test = new StackL<Integer> ();
		test.push(10);
		test.push(11);
		test.pop();
		int actual =  test.peek();
		int expected = 10;
		assertEquals(expected, actual);		
	}
	
	@Test
	void testPeekOnStackAfterPush() {
		
		StackL<Integer> test = new StackL<Integer> ();
		test.push(10);
		int actual =  test.peek();
		int expected = 10;
		assertEquals(expected, actual);		
	}
	
	@Test
	void testPeekOnStackAfterPushPop() {
		
		StackL<Integer> test = new StackL<Integer> ();
		test.push(10);
		test.pop();
		assertThrows(EmptyStackException.class, () -> { test.peek();});	  			
	}
	
	@Test
	void testPopOnEmptyStack() {
		
		StackL<Integer>  test = new StackL<Integer> ();
		
		assertThrows(EmptyStackException.class, () -> { test.pop();});		
		
	}
	
	@Test
	void testPopOnStackAfter2PushPop() {		
		StackL<Integer> test = new StackL<Integer> ();
		test.push(10);
		test.push(11);
		test.pop();
		int actual =  test.pop();
		int expected = 10;
		assertEquals(expected, actual);		
	}
	
	@Test
	void testPopOnStackAfterPush() {
		
		StackL<Integer> test = new StackL<Integer> ();
		test.push(10);
		int actual =  test.pop();
		int expected = 10;
		assertEquals(expected, actual);		
	}
	
	@Test
	void testPopOnStackAfterPushPop() {
		
		StackL<Integer> test = new StackL<Integer> ();
		test.push(10);
		test.pop();
		assertThrows(EmptyStackException.class, () -> { test.pop();});	  			
	}
	
	
	@Test
	void testPushUntilResize() {
		
		StackL<Integer> test = new StackL<Integer> ();
		for (int i = 10; i < 150; i++) {
			test.push(i);
			
		}	
		test.push(150);			
		int actual =  test.pop();
		int expected = 150;
		assertEquals(expected, actual);		
	}
	
	@Test
	void testPushPop2Stacksbye() {
		
		String test = "by the by time is Up";
		StackL<Character> letterStack = new StackL<Character>();
		StackL<Character> answer = new StackL<Character>();
		
		for (char letter : test.toCharArray()) {
		
			if(letter != ' ')
			{
				letterStack.push(letter);
			}
		}
		while (!letterStack.isEmpty() ) {
			if(letterStack.peek() < 'f' || letterStack.peek() > 'r' )
			{
				answer.push(letterStack.pop());
				
			}
			else
			{
			
				letterStack.pop();
			}
			
		}	
		StringBuilder testOut = new StringBuilder(); 
		while(!answer.isEmpty())
		{
			testOut.append(answer.pop());
		}
			assertEquals("bytebytesU",testOut.toString());	
	}
	
	@Test
	void MakeEmptyTest() {
		StackL<String> s = new StackL<String>();
		s.push("hello");
		s.makeEmpty();
		assertTrue(s.size() == 0);
	}
	
	@Test
	void testEmpty() {
		StackL<Object> s = new StackL<Object>();
		assertTrue(s.size() == 0);
	}
	
	@Test
	void testPushOnEmpty() {
		StackL<String> s = new StackL<String>();
		s.push("hello");
		s.push("nemo");
		assertEquals(s.size(), 2);
	}
}
