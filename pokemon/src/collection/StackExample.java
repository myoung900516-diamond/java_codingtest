package collection;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
	
	Stack<String> stack = new Stack<>();
	
	stack.push("네모");
	stack.push("세모");
	stack.push("동그라미");
	
	System.out.println("최신 = " + stack.peek());
	
	stack.pop();
	System.out.println("최신 = " + stack.peek());
	stack.pop();
	System.out.println("최신 = " + stack.peek());
	stack.pop();
//	System.out.println("최신 = " + stack.peek());//없으면 예외 
	}
}
