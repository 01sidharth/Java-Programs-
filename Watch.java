
public class Watch {
      String model,color;
      int price;
}

class Sonata extends Watch
{
	Sonata()
	{
		this.model="SO-1234";
		this.color="white";
		this.price=12000;
	}
	void sonataDetails()
	{
		System.out.println(this.model+" "+this.color+" "+this.price);
	}
}

class Fastrack extends Watch
{
	Fastrack()
	{
		this.model="FK-1784";
		this.color="black";
		this.price=17890;
	}
	void fastrackDetails()
	{
		System.out.println(this.model+" "+this.color+" "+this.price);
	}
}

class Titan extends Watch
{
	Titan()
	{
		this.model="TN-1743";
		this.color="gold";
		this.price=25000;
	}
	void titanDetails()
	{
		System.out.println(this.model+" "+this.color+" "+this.price);
	}
}
