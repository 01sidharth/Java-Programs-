
public class Deposits {
	public static void main(String[] args) 
	{
		int pin=1234;
		int amount=1030000;
		int balance=200000;
		boolean pancard=false;
		System.out.println("Balance amount:"+balance);
		System.out.println("Amount:"+amount);
		if(pin==1234)
		{
			if(amount>100000 && pancard==true)
			{
				balance=balance+amount;
				System.out.println("balance after deposit"+balance);
			}	
		    if(amount<100000) {
					balance=balance+amount;
					System.out.println("balance after deposit"+balance);
			}
						
			if(amount>100000 && pancard==false){
				System.out.println("link pancard");
			}
		}
		
		else
		{
			System.out.println("Incorrect");
		}
	}
}
