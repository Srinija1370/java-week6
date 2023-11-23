package calculator;
public class  calc implements operations{
	public void add(int  a,int b)
	{
		System.out.println("Add: "+(a+b));
	}
	public void sub(int  a,int b)
	{
		System.out.println("Sub: "+(a-b));
	}
	public void mul(int  a,int b)
	{
		System.out.println("Mul: "+(a*b));
	}
	public void div(int  a,int b)
	{
		System.out.println("DIv: "+(a/b));
	}
	public void mod(int  a,int b)
	{
		System.out.println("Mod: "+(a%b));
	}
}
