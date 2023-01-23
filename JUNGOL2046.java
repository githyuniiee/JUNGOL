import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUNGOL2046 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][n];
		int num = 1;
		
		for (int i = 0; i < n; i++) {
			if (m == 1) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = num;
				}
				num++;
			}
			else if(m == 2) {
				for(int j=0; j<n; j++) {
					if(i%2 == 0) {
						arr[i][j] = num++;
					}else 
					arr[i][j] = --num;
					
					}
			}else {
				for(int j=0; j<n; j++) {
					arr[i][j] = (i+1)*(j+1);
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
