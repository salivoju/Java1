import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedHashMap<String,Float> marks = new LinkedHashMap<>();
		for(int i=0;i<N;i++){
			String name = br.readLine();
			Float m = Float.parseFloat(br.readLine());
			marks.put(name, m);
		}
		for(Map.Entry<String,String> G : UserMainCode.calculateGrade(marks).entrySet()){
			System.out.println(G.getKey()+"\n"+G.getValue()); //check output format
		}
	}

}
