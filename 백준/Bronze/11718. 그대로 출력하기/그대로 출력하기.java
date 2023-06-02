import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
		
			while(!(str = br.readLine()).equals("")) {
				System.out.println(str);
			}
		} catch (NullPointerException e) {
			System.out.print("");
		}
	}

}
