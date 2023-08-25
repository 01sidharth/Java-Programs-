
public class Son extends Father {
	String bike="z900";
	String girlfriend="Roso";
	String car="lamborgini";
	void exersice()
	{
		System.out.println("exercise");
	}
	void longdrive()
	{
		System.out.println("longdrive with "+girlfriend+" car-> "+super.car);
		System.out.println("longdrive with "+super.girlfriend+"car-> "+super.car);
	}
	public static void main(String[] args)
	{
		Son s1=new Son();
		s1.longdrive();
	}

}
