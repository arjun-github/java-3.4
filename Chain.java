
//Constructor Chaining
public class Chain {
	Chain(int x)
	{ 
		this();
	 System.out.println("Single argument Constructor");
	}
	
	Chain( int x, int y)
	{	
		
		this(5);
	 System.out.println("Double Argument Constructor");
	
	}
	Chain()
	{
	 System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		Chain obj=new Chain(10,20);
		
	}

}
