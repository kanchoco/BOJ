import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<String, String> member = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();
			member.put(name, state);
			if(state.equals("leave")) {
				member.remove(name);
			}
		}
		int i = 0;
		String result[] = new String[member.size()];
		for(String name : member.keySet()) {
			result[i] = name;
			i++;
		}
		Arrays.sort(result, (n1, n2) ->{
			return n2.compareTo(n1);
		});
		for(String re : result) {
			System.out.println(re);
		}
		
	}
}
