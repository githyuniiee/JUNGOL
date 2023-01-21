import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUNGOL1856 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int[][] Arr = new int[n][m];
    	
    	int num = 1;
    	
    	for(int i=0; i<n; i++) {
    		if(i%2 == 0) {
    			for(int j=0 ; j<m; j++) {
    				Arr[i][j] = num++;
    			}
    		}else {
    			for(int j=m-1; j>=0; j--) {
    				Arr[i][j] = num++;
    			}
    		}
    	}
    	
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<m; j++) {
    			System.out.print(Arr[i][j] + " ");
    		}
    		System.out.println();
    	}
    	
    }
}
