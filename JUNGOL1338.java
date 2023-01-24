import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JUNGOL1338 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
      int n = Integer.parseInt(br.readLine());
      char[][] arr = new char[n][n];
      
     
      for(char[] c : arr){
			Arrays.fill(c, ' ');
		}
      
      
      char alpha = 'A';
      
      
      for(int i=0; i<=n; i++) {
         for(int j=i, k=n-1; j<n; j++, k--) {
            if(alpha > 'Z') alpha = 'A';
            arr[j][k] = alpha++;
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
