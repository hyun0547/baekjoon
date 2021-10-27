package question_10870;

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
		bw.write(fibonacci(num) + "");
		
		bw.flush();
		bw.close();
	}
	
	public static int fibonacci(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 2) + fibonacci(n - 1);
	}
}

