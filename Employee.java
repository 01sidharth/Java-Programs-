
public class Employee {
	String name,company;
	float salary;
	Employee(String n, String c, float s) {
		this.name = n;
		this.company = c;
		this.salary = s;
	}
	void details()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Company:"+this.company);
		System.out.println("Salary:"+this.salary);
	}
	void bonus()
	{
		this.salary=this.salary*10/100f;
	}
	void bonus(float percentage) {
		this.salary=this.salary*(percentage/100f);
	}
	public static void main (String[] args)
	{
		Employee e1= new Employee("Sidhu","Wipro",250000);
		e1.bonus(25f);
		
		e1.details();
	}
	
	
}
