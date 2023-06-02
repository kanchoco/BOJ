import java.util.*;

public class Main {
	public static String stack(String ps) {
		LinkedList<Character> vps = new LinkedList<>();
		
		try {
			for(int j = 0; j < ps.length(); j++) {
				char  n = ps.charAt(j);
				if(n == '(' ) {
					vps.push('(');
				}else {
					vps.pop();
				}
			}
		} catch (NoSuchElementException e) {
			return "NO";
		}
		return vps.isEmpty() ? "YES" : "NO";
	}
	
	public static void main(String[] args) throws NoSuchElementException{
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] result = new String[n];
		
		
		for(int i =0; i<n; i++) {
			String input = sc.next();
			result[i] = stack(input);
		}
		for(String r : result) {
			System.out.println(r);
		}
	}
	
}
