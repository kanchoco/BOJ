import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] numbers = new int[n];
		int min = 0, max = 0;
		for(int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		Arrays.sort(numbers);
		for(int i =0; i < n; i++) {
			System.out.println(numbers[i]);
		}
	}
}