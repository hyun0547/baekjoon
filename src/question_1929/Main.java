package question_1929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String arr[] = br.readLine().split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		TreeSet<Integer> primeNums = new TreeSet<>();
		TreeSet<Integer> picker = new TreeSet<>();
		
		for(int i = 2; i <= num2; i++) {
			if(i >= num1) {
				primeNums.add(i);
			}
			for(int j = 2; i * j <= num2; j++) {
				if(!(picker.contains(j))) {
					picker.add(i * j);
				}
			}
		}
		primeNums.removeAll(picker);
		Iterator<Integer> iter = primeNums.iterator();
		while(iter.hasNext()) {
			bw.write(iter.next() + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
