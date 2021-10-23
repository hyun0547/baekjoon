package question_9020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCnt; i++) {
			int num = Integer.parseInt(br.readLine());
			LinkedHashSet<Integer> picker = new LinkedHashSet<>();
			LinkedHashSet<Integer> primeNums = new LinkedHashSet<>();
			for(int j = 2; j < num; j++) {
				primeNums.add(j);
				for(int k = 2; k * j <= num; k++) {
					picker.add(j * k);
				}
			}
			primeNums.removeAll(picker);
			int result[] = {2, 2};
			for(Integer iter : primeNums) {
				if(primeNums.contains(num - iter) && iter <= num - iter) {
					result[0] = iter;
					result[1] = num - iter;
				}
			}
			bw.write(result[0] + " " + result[1] + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}

