import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean stop = false;
		String score[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
		double scoreInt[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
		double grade = 0.0;
		double sum = 0.0;
		for (int i = 0; i < 20; i++) {
			String input[] = br.readLine().split(" ");
			for (int j = 0; j < score.length; j++) {
				if(input[2].equals(score[j])) {
					grade += Double.valueOf(input[1]) * scoreInt[j];
					sum += Double.valueOf(input[1]);
					break;
				}
			}
		}
		String result = grade==0.0 ? "0.000000" : String.format("%.6f", grade/sum);
		System.out.println(result);
		
	}
}
