package User.Registration;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;


@RunWith(Parameterized.class)
public class TestUC11 {

	   private String email;
	   private Boolean res;
	   private Validate v;
	
	   @Before
	   public void initialize() {
		   v = new Validate();
	   }

	   
	   public TestUC11(String email, Boolean expecRes) {
		      this.email = email;
		      this.res = expecRes;
		   }
	   
	 @Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         {"abc@yahoo.com,", true },
	         {"abc-100@yahoo.com,",true},
	         {"abc-100@yahoo.com,",true},
	         {"abc.100@yahoo.com",true},
	         {"abc111@abc.com,",true},
	         { "abc-100@abc.net,",true},
	         {"abc.100@abc.com.au",true},
	         {"abc@1.com,",true},
	         {"abc@gmail.com.com",true},
	         {"abc+100@gmail.com",true},
	         {"abc",false},
	         {"abc@.com.my",false},
	         {"abc123@gmail.a",false},
	         {"abc123@.com",false},
	         {"abc123@.com.com",false},
	         {".abc@abc.com",false},
	         {"abc()*@gmail.com",false},
	         {"abc@%*.com",false},
	         {"abc..2002@gmail.com",false},
	         {"abc.@gmail.com",false},
	         {"abc@abc@gmail.com",false},
	         {"abc@gmail.com.1a",false},
	         {"abc@gmail.com.aa.au",false}
	      });
	   }
	
	
	@Test
	public void when_Valid_Email_Returns_True() {
//		System.out.println("How many emails you want to validate ?");
//		int count;
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter count: ");
//		count = sc.nextInt();
		//for(int i=0; i<count; i++) {
			//System.out.println("Enter valid email id down below: ");
//			String str = "abc@gmail.com";
//			//String str =sc.nextLine();
//			Validate v = new Validate();
//			boolean email = v.validateEmail(str);
//			Assert.assertEquals(true, email);
//			boolean email1 = v.validateEmail("abc@iiitdmj.ac.in");
//			Assert.assertEquals(true, email1);
		  System.out.println("email-id: " + email);
	      assertEquals(res,v.validateEmail(email));
		//}
	}
	
	
}