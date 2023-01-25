import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUNGOL2857 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		char[][] arr = new char[5][15];
		for (int i = 0; i < 5; i++) {
			String Str = br.readLine();
			for (int j = 0; j < Str.length(); j++) {
				arr[i][j]=Str.charAt(j);
			}
			for (int j = Str.length(); j < 15; j++) {
				arr[i][j]=' ';
			}
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if(arr[j][i]!=' ') {
					sb.append(arr[j][i]);
				}
			}
		}
		System.out.println(sb);
		
		
	}
}
