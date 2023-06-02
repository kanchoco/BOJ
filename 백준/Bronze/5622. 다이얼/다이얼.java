import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine();
		
		int[] numbers = new int[word.length()];
		int result = 0;
//		다이얼을 돌리는 속도까지 계산해서, 번호 +1 
		int[] phone = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};

		for (int i = 0; i < word.length(); i++) {
			result += phone[word.charAt(i) - 'A'];
		}
		
		bw.write(String.valueOf(result));
		bw.close();
	}
}
