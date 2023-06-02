import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] score = new int[n];
		int temp = 0;
		
		for(int i  = 0; i < n; i++) {
			String problem = sc.next();
			temp = 0;
			for(int k = 0; k < problem.length(); k++) { 
				if(problem.charAt(k) == 'O') {
					temp++;
					score[i] += temp;
				}else {
					temp = 0;
				}
			}
		}
		
		for(int s : score) {
			System.out.println(s);
		}
	}
}
