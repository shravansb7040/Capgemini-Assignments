package JavaFiles;

import java.util.Scanner;

class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
    	int attempts=0;
    	String result="";
    	String passed="pass";
    	String fail="fail";
    	if(user.equals(userId) && pass.equals(password))
    	{
    		result=passed;
    	}
    	else
    	{
    	    result=fail;			
    	}
    	return result;
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
    	String userid="", password="";
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Enter User Id: ");
    	userid=scan.next();
    	System.out.print("Enter Password: ");
    	password=scan.next();
    	Login login=new Login();
    	int attempts=0;
    	while(attempts!=4)
    	{
    		if((login.loginUser(userid, password)).equals("pass"))
    		{
    			System.out.print("Welcome Ajay");
    			break;
    		}
    		else
    		{
    	    	if(attempts==2)
    	    	{
    	    		System.out.print("You have entered wrong credentials 3 times\n Contact Admin");
    	    		break;
    	    	}
    	    	else
    	    	{
    	    		attempts++;
        			System.out.print("You have entered wrong credentials ,please enter the right credentials.\n");
        			System.out.print("Enter User Id: ");
        	    	userid=scan.next();
        	    	System.out.print("Enter Password: ");
        	    	password=scan.next();
        	    	login.loginUser(userid, password);
    	    	}
    		}
    	}
    }
}
