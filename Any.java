import java.util.*;
import java.io.*;

 class Another{
	Scanner sc=new Scanner(System.in);
	
	void createAcc()
	{
		System.out.println("____________________________________Welcome to xyz bank....!_______________________________\nwe request you to fill below deatils to sign up");
		System.out.println("Username :");
		String username=sc.nextLine();
		System.out.println("Password :");
		String password=sc.nextLine();
		System.out.println("Confirm Password :");
		String cpassword=sc.nextLine();
		
			if(!cpassword.equals(password))
			{
				System.out.println("above passwords aren't matching please re-enter ur password");
			}
			else 
			{
				writeFile(username,password);
				System.out.println("your login credentials are saved successfully....... ");
			}
		
	}
	
	void writeFile(String username,String password)
	{
		try{
			FileWriter writer=new FileWriter("accdata.txt",true);
			writer.write(username);
			writer.write("\n");
			writer.write(password);
			writer.close();
		}
		catch(IOException e){
			System.out.println("An error occurred.");
      		e.printStackTrace();
		}
		
	}
	
}

class Any{
	public static void main(String args[])
	{
		Another a=new Another();
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to xyz bank's account creation..!\nselect one of the following\n\t1)create an account\n\t2)check account\n\tpress[1 or 2]\n");
		int ch=s.nextInt();
		switch(ch)
		{
			case 1:
					a.createAcc();
					break;
			/**case 2:
					validAcc();
					break;**/
		}
		
	}
}