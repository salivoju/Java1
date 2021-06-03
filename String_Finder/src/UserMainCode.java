
public class UserMainCode {

	public static int stringFinder(String s1, String s2, String s3) {
		if (s1.contains(s2) && s1.contains(s3)) {
			if (s1.indexOf(s2) < s1.lastIndexOf(s3)) {
				return 1;
			}
		} 
		return 2;
	}

}
