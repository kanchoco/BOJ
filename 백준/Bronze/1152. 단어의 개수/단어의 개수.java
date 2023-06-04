import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String aa = sc.nextLine();
		int count = 0;
		
		String[] a1 = aa.split(" ");
		
		for(String a : a1) {
			if(!a.equals("")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
