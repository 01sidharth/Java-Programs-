
public class Interview {
	public static void main(String[] args) {
		int qcode=1;
		int scode=4;
		int yop=2023;
		float perc=56f;
		
		if(qcode==1)
		{
			if((scode==1||scode==2||scode==3||scode==4||scode==5)&&(yop==2022||yop==2023)&&(perc>=55))
			{
				System.out.println("You are eligible");
				System.out.println("Your salary is 4.5 LPA");
				System.out.println("Bond is 2 Years");
				System.out.println("Location is Bangalore");
			}
			if(scode==6||scode==7||scode==8||scode==9)
			{
				System.out.println("Stream is not matching");
			}
			if(yop!=2022&&yop!=2023)
			{
				System.out.println("Year of passout not matching");
			}
			if(perc<55)
			{
				System.out.println("Percentage of mark is not matching");
			}
		}
		else
		{
			System.out.println("Qualification is not matching");
		}
	}

}
