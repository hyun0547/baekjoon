package question_1085;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = br.readLine().split(" ");
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		int w = Integer.parseInt(arr[2]);
		int h = Integer.parseInt(arr[3]);
		ArrayList<Integer> results = new ArrayList<>();
		
		results.add(x);
		results.add(y);
		results.add(w - x);
		results.add(h - y);
		
		int result = results.get(0);
		for(Integer i : results) {
			if(result > i) {
				result = i;
			}
		}
		
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
}
