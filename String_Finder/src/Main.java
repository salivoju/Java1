import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		String s3 = br.readLine();
		int ans = UserMainCode.stringFinder(s1, s2, s3);
		if (ans == 1)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
