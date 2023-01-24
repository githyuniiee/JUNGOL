import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class JUNGOL1430 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      int C = Integer.parseInt(br.readLine());
      
      char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
      
      int[] count = new int[10];
      
      sb.append(A*B*C);
     
      for(int i=0; i<sb.length(); i++) {
    	  for(int j=0; j<numbers.length; j++) {
    		  if(sb.charAt(i) == numbers[j]) {
    			 count[j]++; 
    		  } 
    	  }
      }
      
      for(int i=0; i<count.length; i++) {
    	  System.out.println(count[i]);
      }
      
   }   
}
