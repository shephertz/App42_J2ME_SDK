package com.shephertz.app42.paas.j2me.sample;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import com.shephertz.app42.paas.sdk.jme.App42BadParameterException;
import com.shephertz.app42.paas.sdk.jme.App42Exception;
import com.shephertz.app42.paas.sdk.jme.App42SecurityException;
import com.shephertz.app42.paas.sdk.jme.ServiceAPI;
import com.shephertz.app42.paas.sdk.jme.user.User;
import com.shephertz.app42.paas.sdk.jme.user.UserService;

public class UserSample extends MIDlet {

	public UserSample() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean unconditional)
			throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub
	}

	protected void startApp() throws MIDletStateChangeException {
		//create user on start of App
		
		createUser();
	}
	
	/**
	 * Test Method for creating the User in App42 Cloud. 
	 */
	public static void createUser() {
		// Enter your Public Key and Private Key Here in Constructor. You can 
		// get it once you will create a app in app42 console
		ServiceAPI sp = new ServiceAPI("YOUR_API_KEY","YOUR_SECRET_KEY");
		// Create Instance of User Service
		UserService userService = sp.buildUserService();

		// create user or call other available method on the user service
		// reference
		try {
			System.out.println("Starting User Creation test");
			User user = userService.createUser("Nick", "test",
					"nick@shephertz.com");
			
			//Fetch the returned JSON response 
			System.out.println(" User Creation Successfull !!! JSON Response is : " + user);
			
			//Using returned User object, user property can be fetched
			//Fetch User name from user object
			System.out.println(" Created User Name is : " + user.getUserName());
		} 
		catch (App42BadParameterException ex) {
			System.out.println("App42BadParameterException ");
			// Exception Caught
			// Check if User already Exist by checking app error code
			if (ex.getAppErrorCode() == 2001) {
				// Do exception Handling for Already created User.
				System.out.println(" User already exist with given user name");
			}
		} catch (App42SecurityException ex) {
			// Exception Caught
			// Check for authorization Error due to invalid Public/Private Key
			if (ex.getAppErrorCode() == 1401) {
				System.out.println("Please verify your API_KEY and SECRET_KEY from AppHq Management console(apphq.shephertz.com).");
				// Do exception Handling here
			}
		} catch (App42Exception ex) {
			System.out.println("App42Exception ");
			// Exception Caught due to other Validation
		}

	}


}
