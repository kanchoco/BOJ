import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int students = Integer.parseInt(st.nextToken());
			int[] score = new int[students];
			count = 0;
			result = 0;
			for (int j = 0; j < students; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				result += score[j];
			}
			int average = result/students;
			for(int s : score) {
				if(average < s) {
					count++;
				}
			}
			float rate = (float)count/students * 100;
			sb.append(String.format("%.3f", rate)).append('%').append('\n');
		}
		System.out.println(sb);
	}
}
