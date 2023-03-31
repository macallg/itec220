package itec220.labs;




public class Main {

	public static void main(String[] args) {
		
		String test = "he's all out";
		StackL<Character> letterStack = new StackL<Character>();
		StackL<Character> answer = new StackL<Character>();
		for (char letter : test.toCharArray()) {
		
			if(letter != ' ')
			{
				letterStack.push(letter);
			}
		}
		while (!letterStack.isEmpty() ) {
			if(letterStack.peek() < 'c' || letterStack.peek() > 'r' )
			{
			
				letterStack.pop();
			}
			else
			{
			
				answer.push(letterStack.pop());
			}
			
		}		
		while(!answer.isEmpty())
		{
			System.out.print(answer.pop());
		}
				
	}
	
	
}
