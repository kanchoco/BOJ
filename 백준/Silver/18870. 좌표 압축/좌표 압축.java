import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[n];
		int[] ranking = new int[n];
		int index = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		HashMap<Integer, Integer> compressions = new HashMap<Integer, Integer>();
		
		ranking = numbers.clone();
		Arrays.sort(ranking);
		
		for (int num : ranking) {
			if(!compressions.containsKey(num)) {
				compressions.put(num, index++);
			}
		}
		
		for(int num : numbers) {
			if(compressions.containsKey(num)) {
				sb.append(compressions.get(num)).append(' ');
			}
		}
		
		System.out.println(sb);
	}
}
