import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUNGOL1314 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[100][100];
		char ch = 'A';
		
		for(int i=0; i<n; i++) {
			if(i%2 == 0) {
				for(int j=0; j<n; j++) {
					if(ch > 'Z') ch = 'A';
					arr[j][i] = ch++;
				}
			}else {
				for(int j = n-1; j >= 0; j--) {
					if(ch > 'Z') ch = 'A';
					arr[j][i] = ch++;
				}
			}
		}
			
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
		
		
		
			

	}	
}
