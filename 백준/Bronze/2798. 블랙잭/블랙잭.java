import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int temp = 0;
		int sum = 0;
		int result = 0;
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st1.nextToken());
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int j2 = j+1; j2 < arr.length; j2++) {
					sum = arr[i] + arr[j] + arr[j2];
					if(sum > result && sum <= m) result = sum;
				}
			}
		}
		
		System.out.println(result);
	}
}
