package week2Exercices;
import java.util.Stack;


public class StackClient {
	//Stack<String> stack = new Stack<String>();
	public static Stack copy(Stack<String> stack) {
		Stack<String> NewStack = new Stack<String>();
		while(!stack.isEmpty()) {
			NewStack.push(stack.pop());	
		}
		return NewStack;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack1 = new Stack<>();
		stack1.push("uno");
		stack1.push("dos");
		stack1.push("tres");
		
		Stack<String> stackcopy = copy(stack1);
		
		System.out.println("Original Stack");
		for(String element1: stack1) {
			System.out.println(element1);
		}
		
		System.out.println("Copied Stack:");
	    for (String element : stackcopy) {
	        System.out.println(element);
	    }
	}

}
