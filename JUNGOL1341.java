import java.io.*;
import java.util.*;

public class JUNGOL1341 {
 
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
    	int s = Integer.parseInt(st.nextToken());
    	int e = Integer.parseInt(st.nextToken());
        
        while(s<2 || s>9 || e<2 || e>9) {
        	System.out.println("INPUT ERROR!");
            st = new StringTokenizer(br.readLine());
        	s = Integer.parseInt(st.nextToken());
        	e = Integer.parseInt(st.nextToken());
        }
        
      
        if (s < e) {
            for (int i = s; i <= e; i++) {
                for (int j = 1; j <=9; j++) {
                    
                    if(j==4 || j==7) {
                    	System.out.println();
                    }
                    System.out.printf("%d * %d = %2d   ", i, j, (j*i));
                }
                 System.out.println("\n");
            }
        } else {
            for (int i = s; i >= e; i--) {
                for (int j = 1; j <= 9; j++) {
                	if(j==4 || j==7) {
                    	System.out.println();
                    }
                    System.out.printf("%d * %d = %2d   ", i, j, (j*i));
                }
                 System.out.println("\n");
            }
        }
    	
    }
}
