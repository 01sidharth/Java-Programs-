
public class Car {
        String name;
        int cc;
        int price;
        float tax;
        float insurance;
        
        Car(String n,int c,int p,float t,float i){
        	this.name=n;
        	this.cc=c;
        	this.price=p;
        	this.tax=t;
        	this.insurance=i;
        	
        }
        void calculateTax()
        {
        	if(this.price<500000)
        	{
        		this.tax=this.price*13/100f;
        	}
        	if(this.price>=500000 && this.price<1000000)
        	{
        		this.tax=this.price*15/100f;
        	}
        	if(this.price>=1000000 && this.price<2000000)
        	{
        		this.tax=this.price*17/100f;
        	}
        	if(this.price>=2000000)
        	{
        		this.tax=this.price*19/100f;
        	}
        }
        void calaculateInc()
        {
        	if(this.cc<805)
        	{
        		this.insurance=(this.insurance+1750)*5;
        	}
        	if(this.cc>=805 && this.cc<1501)
        	{
        		this.insurance=(this.insurance+2350)*5;
        	}
        	if(this.cc>=1501 && this.cc<3000)
        	{
        		this.insurance=(this.insurance+5850)*5;
        	}if(this.cc>=3000)
        	{
        		this.insurance=(this.insurance+8850)*5;
        	}
        }
        void details()
        {   float total = this.tax+this.price+this.insurance;
        	System.out.println("car:"+this.name);
        	System.out.println("cc:"+this.cc);
        	System.out.println("Price of the car:"+this.price);
        	System.out.println("Tax:"+this.tax);
        	System.out.println("Insurance:"+this.insurance);
        	System.out.println("On-Road price:"+total);
        	System.out.println("------------------------------------------");
        }
        public static void main(String[] args)
        {
        	Car c1=new Car("verna",1500,1445000,0,0);
        	Car c2=new Car("swift",2000,545000,0,0);
        	c1.calculateTax();
        	c1.calaculateInc();
        	c1.details();
        	c2.calculateTax();
        	c2.calaculateInc();
        	c2.details();
        	
        }
}
