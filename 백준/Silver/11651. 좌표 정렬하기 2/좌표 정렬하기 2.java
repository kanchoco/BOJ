import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] numbers = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				numbers[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(numbers, (n1, n2) -> {
			if(n1[1] == n2[1]) {
				return n1[0] - n2[0]; 
			}else {
				return n1[1] - n2[1];
			}
		});
		for(int[] num : numbers) {
			sb.append(num[0] + " " + num[1] + "\n");
		}
		System.out.println(sb);
	}
}