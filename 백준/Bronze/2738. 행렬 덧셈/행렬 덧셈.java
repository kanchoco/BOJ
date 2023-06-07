import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[][] arr = new String[n*2][m];
		StringBuilder sb= new StringBuilder();
		
 		for (int i = 0; i < n*2; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = token.nextToken(); 
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sb.append(Integer.parseInt(arr[i][j]) + Integer.parseInt(arr[i+n][j])).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
