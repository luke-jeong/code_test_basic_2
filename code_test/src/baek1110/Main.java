package baek1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws IOException {
		 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 	int N = Integer.parseInt(br.readLine());
		 	
		 	int count = 0;
		 	int origin = N;
		 	
		 	do {
		 		N = ((N%10)*10)+(((N/10)+(N%10))%10);
		 		count ++;
		 	}while(origin != N);
		 	
		 	System.out.println(count);
	 }
}
