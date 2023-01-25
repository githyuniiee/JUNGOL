import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JUNGOL2514 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();

		sb.append(str);

		for (int i = 0; i < sb.length(); i++) {
			if (sb.length() > 10000 || sb.charAt(i) > 'Z' || sb.charAt(i) < 'A') {
				System.out.println("Error!");
				return;
			}
		}

		int cnt = 0;
		int cnt2 = 0;

		for (int i = 0; i < sb.length() - 2; i++) {
			if (sb.charAt(i) == 'K') {
				if (sb.charAt(i + 1) == 'O' && sb.charAt(i + 2) == 'I') {
					cnt++;
				}
			} else if (sb.charAt(i) == 'I') {
				if (sb.charAt(i + 1) == 'O' && sb.charAt(i + 2) == 'I') {
					cnt2++;
				}
			}
		}

		System.out.println(cnt);
		System.out.println(cnt2);
	}
}
