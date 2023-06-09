import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		StringBuilder sb = new StringBuilder();
		int max = 0;
		int number = 0;
		int x = 0, y = 0;
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				number = Integer.parseInt(st.nextToken());
				if(max < number) {
					max = number;
					x = i;
					y = j;
				}
				arr[i][j] = number;
			}
		}
		sb.append(max).append('\n').append(x+1).append(' ').append(y+1);
		System.out.println(sb);
	}
}
