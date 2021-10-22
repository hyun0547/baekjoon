package question_4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			int num1 = Integer.parseInt(br.readLine());
			if(num1 == 0) {
				break;
			}
			int num2 = num1 * 2;
			HashSet<Integer> primeNums = new HashSet<>();
			HashSet<Integer> picker = new HashSet<>();
			
			for(int i = 2; i <= num2; i++) {
				if(i > num1) {
					primeNums.add(i);
				}
				for(int j = 2; i * j <= num2; j++) {
					if(!(picker.contains(j))) {
						picker.add(i * j);
					}
				}
			}
			primeNums.removeAll(picker);
			
			bw.write(primeNums.size() + "\n");
		}
		bw.flush();
		bw.close();
	}
}
