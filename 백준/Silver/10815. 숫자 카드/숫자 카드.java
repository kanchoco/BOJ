import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sangeun = br.readLine().split(" ");
		int m = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> numberMap = new HashMap<>();
		
		for(String num : sangeun) {
			numberMap.put(num, 0);
		}
		for(int i = 0; i < m; i++) {
			if(numberMap.get(arr[i]) != null) {
				sb.append(1).append(' ');
				continue;
			}
			sb.append(0).append(' ');
		}
		System.out.println(sb);
	}
}
