import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[][] arrs = new String[n][2];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arrs[i][0] = st.nextToken();
			arrs[i][1] = st.nextToken();
		}
		
		Arrays.sort(arrs, (n1, n2) -> {
			return Integer.parseInt(n1[0]) - Integer.parseInt(n2[0]);
		});
		
		for(String user[] : arrs) {
			sb.append(user[0] + " " + user[1] + "\n");
		}
		System.out.println(sb);
	}
}
