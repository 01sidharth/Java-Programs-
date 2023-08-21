
public class Mark {
        String name;
        int physics,chemistry,maths,optional;
		public Mark(String name, int physics, int chemistry, int maths, int optional) {
			this.name = name;
			this.physics = physics;
			this.chemistry = chemistry;
			this.maths = maths;
			this.optional = optional;
			this.details();
			this.percentage();
			
		}
		int total()
		{
			int sum=this.chemistry+this.maths+this.physics+this.optional;
			System.out.println("Total Marks:"+sum);
			return sum;
		}
		void percentage()
		{
			int x=this.total();
			float perc=x/400f*100;
			System.out.println("Percentage of maks:"+perc);
		}
		void details()
		{
			System.out.println("Name of Student:"+this.name);
			System.out.println("Marks for Physics:"+this.physics);
			System.out.println("Marks for Chemistry:"+this.chemistry);
			System.out.println("Marks for Maths:"+this.maths);
			System.out.println("Marks for Optional:"+this.optional);
		}
		public static void main(String[] args)
		{
			Mark m1=  new Mark("Sidharth",86,83,98,88);
		}
		
}
