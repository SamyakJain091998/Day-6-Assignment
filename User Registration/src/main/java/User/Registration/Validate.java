package User.Registration;
import java.util.regex.*; 
import java.util.*;
public class Validate {
	
//	public  boolean isValidFirstName(String msg) 
//	{ 
//
//		String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
//		Pattern p = Pattern.compile(regex); 
//		Matcher m = p.matcher(msg); 
//		return m.matches(); 
//	} 
	
//	public  boolean isValidEmail(String msg) 
//	{ 
//
//		String regex = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
//		Pattern p = Pattern.compile(regex); 
//		Matcher m = p.matcher(msg); 
//		return m.matches(); 
//	} 
//	
////		public  boolean validateFirstName(String firstName) {
////		Validate val = new Validate();
////		boolean ans = val.isValidFirstName(firstName);
////		return ans;
////	}
//		
//		public  boolean validateEmail(String eMail) {
//			Validate val = new Validate();
//			boolean ans = val.isValidEmail(eMail);
//			return ans;
//			}		
	
		
		public boolean validateEmail(String email)
		{
			String emailregx = "^[a-zA-Z0-9]+[a-zA-Z0-9+_.-]+[a-zA-Z0-9]+@[a-zA-Z0-9]+[.][a-zA-Z0-9,]+[a-zA-Z0-9,.]+$"; 
		    Pattern p = Pattern.compile(emailregx);
		    Matcher m = p.matcher(email);
		    return (m.matches());
		}
		
}