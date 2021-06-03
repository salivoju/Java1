

public class UserMainCode {

	public static String extractMax(String str, String delim) {
		String[] words = str.split(delim);
		int max = Integer.MIN_VALUE;
		String result = null;
		for(String W:words){
			if(W.length()>max){
				max =W.length();
				result=W;
			}
		}
		return result.toUpperCase().substring(0, 1)+result.substring(1);
		
	}

}
