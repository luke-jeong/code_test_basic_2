package baek10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws IOException {
		 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 	
		 	int N = Integer.parseInt(br.readLine());
		 	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 	
		 	int idx = 0;
		 	int[] arr = new int[N];
		 	
		 	while(st.hasMoreTokens()) {
		 		arr[idx] = Integer.parseInt(st.nextToken());
		 		idx++;
		 	}
		 	Arrays.sort(arr);
		 	System.out.print(arr[0] + " " + arr[N-1]);
		 	
		 	
		 	
	 }
}
