package question_4153;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String sides[] = br.readLine().split(" ");
			String min = "0";
			
			for(int i = 0; i < sides.length; i++) {
				if(!sides[i].equals("0")) {
					min = sides[i];
				}
			}
			if(min.equals("0")) {
				break;
			}
			
			for(int i = 0; i < sides.length; i++) {
				for(int j = 1; i + j < sides.length; j++) {
					if(Integer.parseInt(sides[i]) > Integer.parseInt(sides[i + j])){
						String tmp = sides[i];
						sides[i] = sides[i + j];
						sides[i + j] = tmp;
					}
				}
			}
			int side1 = Integer.parseInt(sides[0]);
			int side2 = Integer.parseInt(sides[1]);
			int side3 = Integer.parseInt(sides[2]);
			
			int sides1 = (side1 * side1) + (side2 * side2);
			int sides2 = side3 * side3;
			if(sides1 == sides2) {
				bw.write("right\n");
			}else {
				bw.write("wrong\n");
			}
			
			
		}
		
		bw.flush();
		bw.close();
	}
}
