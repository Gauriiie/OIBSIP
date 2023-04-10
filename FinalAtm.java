
package AtmInterface;
import java.util.*;

class DemoAtm
{
	 
	String name,username,password,accountnumber;
	float balance=100000f;
	int transactions=0;
	String transactionHistory="";
	Scanner sc=new Scanner(System.in);
	float amount;
	String key;
	

	DemoAtm(String username,String password)
	{
		this.username=username;
		this.password=password;
		
	}
	//depositing money
	public void deposit()
	{
		System.out.println("enter you pin= " );
		key=sc.nextLine();
		if(key.equals(password))
		{
		System.out.println("Enter the Amount to be Deposited=");
		amount=sc.nextFloat();
		 
		try
		{
			if(amount<=balance)
			{
				transactions++;
				balance+=amount;
				System.out.println(amount+" credited to your account");
				String str=amount+" rps deposited";
				transactionHistory=transactionHistory.concat(str);
				
			}
			else
			{
				System.out.println("limit exceeded");
			}
		}
		catch(Exception e)
		{
			
		}
		}
		else
		{
			System.out.println("Sorry!!Wrong password");
		}
	}
	//withdrawing money
	public void withdraw()
	{
		System.out.println("enter you pin= " );
		key=sc.nextLine();
		 
		
		if(key.equals(password))
		{
			System.out.println("enter amount to be Withdraw=");
			amount=sc.nextFloat();
	 
		 
		try 
		{
		if(balance>=amount)
		{
			transactions++;
			balance-=amount;
			System.out.println(amount+" debited from your account");
			String str=amount+" rps Withdrawed";
			transactionHistory=transactionHistory.concat(str);
			
		}
		else
		{
			System.out.println("insufficient Balance!");
		}
		}
		catch(Exception e)
		{
			
		}
		}
		else
		{
			System.out.println("Sorry!!Wrong password");
		}
		
		
	}
	//transfering money
	public void transfer()
	
	{
		System.out.println("enter you pin= " );
		key=sc.nextLine();
		if(key.equals(password))
		{
		System.out.println("enter receipent name=");
		String Receipent=sc.nextLine();
		System.out.println("enter amount to tranfer=");
		amount=sc.nextFloat();
		
		
		try {
		if(balance>=amount)
		{
			if(amount<=50000f)
			{
				transactions++;
				balance-=amount;
				System.out.println(amount+" Successfully tranfer to" +Receipent);
				String str=amount+" rps tranferred";
				transactionHistory=transactionHistory.concat(str);
			}
			
		}
		else
		{
			System.out.println("limit exceeded");
		}
		}
		catch(Exception e)
		{
			
		}
		}
		else
		{
			System.out.println("Sorry!!Wrong password");
		}
		
	}
	//checking balance
	public void balanceCheck()
	{
		System.out.println("enter you pin= " );
		key=sc.nextLine();
		if(key.equals(password))
		{
		System.out.println(balance+"rps");
		}
		else
		{
			System.out.println("Sorry!!Wrong password");
		}
	}
	//checking history
	public void transactionHis()
	{
		if(key.equals(password))
		{
		System.out.println("enter you pin= " );
		key=sc.nextLine();
		if(transactions==0)
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println(" "+transactionHistory);
		}
	}
		else
		{
			System.out.println("Sorry!!Wrong password");
		}
	}
	

	
	
}

public class FinalAtm 
{
    
	public static void main(String[] args) 
	{
		String msg1;
		DemoAtm atm=new DemoAtm("Gauri","1125");
		Scanner s=new Scanner(System.in);
		System.out.println("****WELCOME*****");
		System.out.println("\n1)continue \n2)exit");
		System.out.println("enter your choise:");
		int choise=s.nextInt();
		
		if(choise==1)
		{
			
				System.out.println("\n1)login\n2)exit");
				System.out.println("enter your choise:");
				int ch=s.nextInt();
				if(ch==1)
				{
					
						System.out.println("******Welcome Back "+atm.username+"**************");
						

						System.out.println("\n1)Withdraw/n2)Deposite\n3)Transfer\n4)Check Balance\n5)transaction History\n6)finished");
						System.out.println("enter your choise:");
						int ch1=s.nextInt();
						switch(ch1)
						{
						case 1:
							atm.withdraw();
							break;
						case 2:
							atm.deposit();
							break;
						case 3:
							atm.transfer();
							break;
						case 4:
							atm.balanceCheck();
							break;	
						case 5:
							atm.transactionHis();
							break;
						}
					}
				else
				{
					System.out.println("Thank You "+atm.username+"!"+"\n Visit Again.");
					System.exit(0);
					 
				}
				
				}
				else
				{
					System.out.println("Thank You "+atm.username+"!"+"\n Visit Again.");
					System.exit(0);
				}
		 
		 
				
			}
	
			
			
	}
		 
	
	

	

