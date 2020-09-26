package User.Registration;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;
//@RunWith(Parameterized.class)
public class TestFirstName {

	@Test
	public void when_Valid_First_Name_Returns_True() {
		System.out.println("Enter valid first name down below: ");
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		//String str = "Sa";
		Validate v = new Validate();
		boolean firstName = v.validateFirstName(str);
		Assert.assertEquals(true, firstName);
	}
	
	@Test
	public void when_Valid_Last_Name_Returns_True() {
		System.out.println("Enter valid last name down below: ");
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		//String str = "Sa";
		Validate v = new Validate();
		boolean lastName = v.validateLastName(str);
		Assert.assertEquals(true, lastName);
	}
	
	@Test
	public void when_Valid_Email_Returns_True() {
		System.out.println("Enter valid email id down below: ");
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		//String str = "Sa";
		Validate v = new Validate();
		boolean email = v.validateEmail(str);
		Assert.assertEquals(true, email);
	}
	
	@Test
	public void when_Valid_Mobile_Number_Returns_True() {
		System.out.println("Enter valid mobile number down below: ");
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		//String str = "Sa";
		Validate v = new Validate();
		boolean email = v.validateMobileNumber(str);
		Assert.assertEquals(true, email);
	}
	
	@Test
	public void when_Valid_Password_Returns_True() {
		System.out.println("Enter valid password down below: ");
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		//String str = "Sa";
		Validate v = new Validate();
		boolean password = v.validatePassword(str);
		Assert.assertEquals(true, password);
	}
	
	@Test
	public void sad() {
		Validate v = new Validate();
		String mood = v.analyseMood("sad");
		Assert.assertEquals("sad", mood);
	}

	@Test
	public void happy() {
		Validate v = new Validate();
		String mood1 = v.analyseMood("happy");
		Assert.assertEquals("happy", mood1);
	}
	
}
