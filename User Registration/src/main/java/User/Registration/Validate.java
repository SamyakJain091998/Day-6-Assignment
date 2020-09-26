package User.Registration;
import java.util.regex.*; 
import java.util.*;
public class Validate {
	
	public  boolean isValidFirstName(String msg) 
	{ 

		String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(msg); 
		return m.matches(); 
	} 
	
	public  boolean isValidLastName(String msg) 
	{ 

		String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(msg); 
		return m.matches(); 
	} 
	
	public  boolean isValidEmail(String msg) 
	{ 

		String regex = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(msg); 
		return m.matches(); 
	} 
	
	public  boolean isValidMobileNumber(String msg) 
	{ 

		String regex = "^[1-9]{1}[0-9]{1}\\s{1}[1-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(msg); 
		return m.matches(); 
	} 
	
	public  boolean isValidPassword(String msg) 
	{ 

		String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*\\W)[a-zA-Z0-9\\@\\_\\-\\+\\#\\*]{8,}$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(msg); 
		return m.matches(); 
	} 
	
	public  boolean validateFirstName(String firstName) {
		Validate val = new Validate();
		boolean ans = val.isValidFirstName(firstName);
		return ans;
	}
	
	public  boolean validateLastName(String lastName) {
	Validate val = new Validate();
	boolean ans = val.isValidLastName(lastName);
	return ans;
	}
	
	public  boolean validateEmail(String eMail) {
		Validate val = new Validate();
		boolean ans = val.isValidEmail(eMail);
		return ans;
		}
	
	public  boolean validateMobileNumber(String mobileNumber) {
		Validate val = new Validate();
		boolean ans = val.isValidMobileNumber(mobileNumber);
		return ans;
		}
	
	public  boolean validatePassword(String paswd) {
		Validate val = new Validate();
		boolean ans = val.isValidPassword(paswd);
		return ans;
		}
	
	public String analyseMood(String message) {
		// TODO Auto-generated method stub
		//String demos = "SAD";
		if(message.contains("sad")) {
			return "sad";
		}
		else if(message.contains("happy")) {
			return "happy";
		}
		else {
			return "default";
		}
		//return message;
	};
	
}
