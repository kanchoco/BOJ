import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		sb.append((a+b)%c + "\n");
		sb.append(((a%c) + (b%c))%c  + "\n");
		sb.append((a*b)%c + "\n");
		sb.append(((a%c) * (b%c))%c);
		System.out.println(sb);
		bf.close();
	}
}