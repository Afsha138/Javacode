package afsha;


class Bank {
	 String Name;
	 String Location;
	void Bank(String name,String location)
	 {
		 this.Name=name;
		 this.Location=location;
		 System.out.println("Name of the Bank is "+Name+".");
		 System.out.println("Location of the Bank is "+Location+".");
	 }
}
class Branches extends Bank
{
	 String Branch_Name;
	 int Contact;
	 String Address;
	 	
	 void Bank(String name,int Contact,String address)
	 {
		 this.Branch_Name=name;
		 this.Contact=Contact;
		 this.Address=address;
		
		 System.out.println("Name of the Branch is "+Branch_Name+".");
		 System.out.println("Contact of the Branch is "+Contact+".");
		 System.out.println("Address of the Branch is "+Address+".");
		 
		 
	 }
	
}

public class Main extends Branches

	
{
	
		public static void main(String[] args)
		{
			
			Main bank1=new Main();
			Main bank2=new Main();
			bank1.Bank("HDFC","KURLA");
			bank1.Bank("KIROL",02224315676,"LBS Marg,KURLA");
			

	}
}

