package baek2577;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int value = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
			
			int[] arr = new int[10];
			
			String str = String.valueOf(value);
			
			for(int i=0; i<str.length(); i++) {
				arr[str.charAt(i)-48]++;
			}
			for(int v : arr) {
				System.out.println(v);
			}
		
	}
}

