import java.io.BufferedReader;
import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder result = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			switch (s) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				result.append(stack.isEmpty() ? -1 + "\n" : stack.pop() + "\n");
				break;
			case "size":
				result.append(stack.size() + "\n");
				break;
			case "empty":
				result.append(stack.isEmpty()? 1 + "\n" : 0 + "\n");
				break;
			default:
				result.append(stack.isEmpty()? -1 + "\n" : stack.peek() + "\n");
				break;
			}
		}
		
		System.out.println(result);
		
	}

	
}
