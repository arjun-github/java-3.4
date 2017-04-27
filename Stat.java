
//Use of static variables and Static Method
public class Stat {

	static int a,b,c;
	static void add(int x, int y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) 
	{
		add(10,20);
	}

}
