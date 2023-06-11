import java.util.*;
import java.io.*;

public class Main {
	static int[][] arr = new int[100][100];
	static int count = 0;
	public static void square(int y, int x) {
		int dx = x + 10;
		int dy = y + 10;
		
		for (int i = x; i < dx; i++) {
			for (int j = y; j < dy; j++) {
				if(arr[i][j] == 0) {
					arr[i][j] = 1;
					count++;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			square(y, x);
		}
		System.out.println(count);
	}
}
