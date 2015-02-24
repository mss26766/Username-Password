/**Author Manpreet Singh Saini
 *E-mail: mss26766@email.vccs.edu
 *For educational purposes only
 *Description for the new user to create username and password.
 *Allow username to log in with same username and password and check the username and password. 
 */
import java.util.Scanner;
public class UsernameAndPassword {
public static void main(String[]args)
{
	String newusername, newpassword, username, password;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Create new Username.");
	newusername=keyboard.nextLine();
	System.out.println("Create new Password.");
	newpassword = keyboard.nextLine();
	System.out.println("Enter the Username.");
	username = keyboard.nextLine();
	if (username.compareTo(newusername)==0) 
	     /**Using compareTo returns a number. If the username==newusername it should 
	      * return 0 
	      */
	{
		System.out.println("Enter Password");
		password = keyboard.nextLine();
		if (password.compareTo(newpassword)==0)
			System.out.println("Welcome " + username);
		else System.out.println("Wrong Username or Password!");
	}
	else System.out.println("Wrong Username or Password!");
	
     }
}
