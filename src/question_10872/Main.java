package question_10872;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		bw.write(factorial(num) + "");
		
		bw.flush();
		bw.close();
	}
	
	public static int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
