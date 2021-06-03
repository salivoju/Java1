import java.text.ParseException;
import java.text.SimpleDateFormat;
public class UserMainCode {
	public static int getValidDate(String str){
		if(str.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}") || 
				str.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}") || 
				str.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}")){
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
			sdf.setLenient(false);
			sdf1.setLenient(false);
			sdf2.setLenient(false);
			try{
				sdf.parse(str);
				return 1;
			}
			catch(ParseException e){
				try{
					sdf1.parse(str);
					return 1;
				}
				catch(ParseException e1){
					try{
						sdf2.parse(str);
						return 1;
					}
					catch(ParseException e2){
						return -1;
					}
				}
			}
		}
		else{
			return -1;
		}
	}
}