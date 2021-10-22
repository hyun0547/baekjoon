package question_9020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCnt; i++) {
			int num = Integer.parseInt(br.readLine());
			TreeSet<Integer> picker = new TreeSet<>();
			TreeSet<Integer> primeNums = new TreeSet<>();
			
			for(int j = 2; j <= num; j++) {
				primeNums.add(j);
				for(int k = 2; j * k <= num; k++) {
					if(!(picker.contains(j))) {
						picker.add(j * k);
					}
				}
			}
			primeNums.removeAll(picker);
			int result[] = {2, 2};
			for(Iterator<Integer> iter1 = picker.iterator(); iter1.hasNext();) {
				int curIter1 = iter1.next();
				for(Iterator<Integer> iter2 = picker.iterator(); iter2.hasNext();) {
					int curIter2 = iter2.next();
					if(curIter1 > result[0] && curIter1 - curIter2 <= 0) {
						result[0] = curIter1;
						result[1] = curIter2;
					}
				}
			}
			bw.write(result[0] + " " + result[1] + "\n");
			
		}
		
		bw.flush();
		bw.close();
	}
}

