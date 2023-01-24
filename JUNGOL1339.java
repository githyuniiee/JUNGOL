import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JUNGOL1339 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
      int n = Integer.parseInt(br.readLine());
      char[][] arr = new char[n][n];
     
      
      if( n%2 == 0 || n<=0 || n>100) {
    	  System.out.println("INPUT ERROR");
    	  return;
      }
      
      for(char[] c : arr) {
    	  Arrays.fill(c, ' ');
      }
      
      char alpha = 'A';
      
      for (int i = n/2; i >= 0; i--) {
			for (int j = i; j <= n-i-1; j++) {
				arr[j][i]=alpha++;
				if (alpha > 'Z') {alpha = 'A';}
				
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
