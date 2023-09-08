
public class Watchshowroom {
        Watch getWatch(String n)
        {
        	if(n.equalsIgnoreCase("Titan"))
        	{
        		return new Titan();
        	}
        	else if(n.equalsIgnoreCase("Fastrack"))
        	{
        		return new Fastrack();
        	}
        	else if(n.equalsIgnoreCase("Sonata"))
        	{
        		return new Sonata();
        	}
        	else 
        	{
        		System.out.println("watch not found");
        		return null;
        	}
        }
        public static void main(String[] args) {
			Watchshowroom w1=new Watchshowroom();
			Watch x=w1.getWatch("soNata");
			if(x!=null)
			{
				if( x instanceof Titan)
				{
					Titan t=(Titan)x;
					t.titanDetails();
				}
				else if( x instanceof Fastrack)
				{
					Fastrack f=(Fastrack)x;
					f.fastrackDetails();
				}
				if( x instanceof Sonata)
				{
					Sonata s=(Sonata)x;
					s.sonataDetails();
				}
			}
			
		}
}
