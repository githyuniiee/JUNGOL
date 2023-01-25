import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JUNGOL2604 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();

		sb.append(str);

		if (sb.length() < 3 || sb.length() > 50) {
			System.out.println("Error!");
			return;
		}

		int total = 10;

		for (int i = 0; i < sb.length()-1; i++) {
			if (sb.charAt(i) == sb.charAt(i + 1)) {
				total += 5;
			} else {
				total += 10;
			}
		}

		System.out.print(total);
	}
}
