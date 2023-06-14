import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		int count = 0;
	
		for(int i = 0; i < n; i++) {
			map.put(br.readLine(), 0);
		}
		for(int i = 0; i < m; i++) {
			if(map.get(br.readLine()) != null) {
				count++;
			}
		}
		System.out.println(count);
	}
}
