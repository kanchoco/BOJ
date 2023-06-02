import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		데이터의 범위
		int[] arr = new int[10001];
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<n; i++) {
//			해당 인덱스의 값을 증가
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		
		for(int i = 0; i < 10001; i++) {
			while(arr[i] > 0) {
				sb.append(i).append('\n');
				arr[i]--;
			}
		}
		System.out.println(sb);
	}
}
