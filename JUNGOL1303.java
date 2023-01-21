import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUNGOL1303 {
 
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int a = 1;
    	
    	if((0<=n && n<=100) && (0<=m && m<=100)) {
    	for(int i=1; i<=n; i++) {
    		for(int j=1; j<=m; j++) {
    			System.out.print(a++ + " ");
    		}
    		System.out.println();
    	}
    }
    }
}
