import java.util.*;

public class Main {
	public static void main(String[] args) {
		//다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램 
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int numbers[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			numbers[i] = num;
			result += num;
		}
		Arrays.sort(numbers);
		System.out.println(result/5 + "\n" + numbers[2]);
	}
}
