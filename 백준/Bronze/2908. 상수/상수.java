import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] numbers = new String[2];
		Arrays.fill(numbers, "");
		
		for (int i = 0; i < 2; i++) {
			String num = st.nextToken();
			for (int j = 2; j > -1; j--) {
				numbers[i] += num.charAt(j);
			}
		}
		Arrays.sort(numbers);
		System.out.println(numbers[1]);
	}
}
