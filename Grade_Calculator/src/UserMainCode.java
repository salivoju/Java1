import java.util.LinkedHashMap;
import java.util.Map;

public class UserMainCode {
	public static LinkedHashMap<String,String> calculateGrade(LinkedHashMap<String,Float> marks){
		LinkedHashMap<String,String> Grade = new LinkedHashMap<>();
		for(Map.Entry<String,Float> i:marks.entrySet()){
			if(i.getValue()>=60){
				Grade.put(i.getKey(), "PASS");
			}
			else if(i.getValue()<60){
				Grade.put(i.getKey(), "FAIL");
			}
		}
		return Grade;
	}
}

