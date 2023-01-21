import java.io.*;
import java.util.*;

public class JUNGOL1291 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int s = Integer.parseInt(st.nextToken());
    	int e = Integer.parseInt(st.nextToken());
        
        while(s<2 || s>9 || e<2 || e>9) {
        	System.out.println("INPUT ERROR!");
            st = new StringTokenizer(br.readLine());
        	s = Integer.parseInt(st.nextToken());
        	e = Integer.parseInt(st.nextToken());
        }
        
        if (s < e) {
            for (int i = 1; i <= 9; i++) {
                for (int j = s; j <= e; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, (j*i));
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                for (int j = s; j >= e; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, (j*i));
                }
                System.out.println();
            }
        }
    }
}
