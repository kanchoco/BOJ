import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String temp = "";
		String word = "";
		int result = 0;
		for (int i = 0; i < n; i++) {
			temp = "";
			word = br.readLine();
			for (int j = 0; j < word.length(); j++) {
				String a = String.valueOf(word.charAt(j));
				if(j != 0 && temp.contains(a) && !a.equals(String.valueOf(word.charAt(j-1)))) {
					temp = "false";
					break;
				}
				temp += word.charAt(j);
			}
			
			if(!temp.equals("false")) result++;
		}
		System.out.println(result);
	}
}
