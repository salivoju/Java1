import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String D = br.readLine();
		if(UserMainCode.getValidDate(D)==1){
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
	}

}
