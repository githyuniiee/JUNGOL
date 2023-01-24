import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JUNGOL1692 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N1 = Integer.parseInt(br.readLine());
		int N2 = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int temp = N2%10;
		sb.append(N1*temp + "\n");
	
		temp = (N2/10)%10;
		sb.append(N1*temp + "\n");
		
		temp = (N2/100);
		sb.append(N1*temp + "\n");
		
		
		sb.append(N1*N2);
		System.out.println(sb);
	}
	
}