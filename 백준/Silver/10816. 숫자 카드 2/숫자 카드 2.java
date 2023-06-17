import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> sangeun = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			String num = st.nextToken();
			sangeun.put(num, sangeun.getOrDefault(num, 0)+1);
		}
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			String card = st1.nextToken();
			if(sangeun.get(card) != null) {
				sb.append(sangeun.get(card)).append(' ');
			}else {
				sb.append(0).append(' ');
			}
		}
		System.out.println(sb);
	}
}
