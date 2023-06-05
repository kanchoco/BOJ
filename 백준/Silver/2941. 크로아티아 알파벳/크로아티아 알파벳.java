import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String result = "";
		String input  = br.readLine();
		int temp = 0;
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			result += input.charAt(i);
			for(String croatia : croatias) {
				if(result.contains(croatia)) {
					temp += result.length() - croatia.length();
					count++;
					result = "";
					break;
				}
			}
		}
		temp += result.length();
		System.out.println(count+temp);
	}
}
