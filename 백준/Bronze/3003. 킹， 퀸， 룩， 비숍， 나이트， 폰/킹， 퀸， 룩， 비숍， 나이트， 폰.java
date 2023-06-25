import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] piece = {1, 1, 2, 2, 2, 8};
		for(int i = 0; i < piece.length; i++) {
			int number = Integer.parseInt(st.nextToken());
			if(piece[i] - number != 0) {
				sb.append(piece[i] - number).append(' ');
			}else {
				sb.append(0).append(' ');
			}
		}
		System.out.println(sb);
	}
}
