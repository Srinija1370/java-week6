import shapes.*;
public class ArPr{
	public static void main(String[] args)
	{
		Square s=new Square();
		Triangle t=new Triangle();
		Circle c=new Circle();
		
		s.area(5);
		s.perimeter(4);
		
		t.area(3,6);
		t.perimeter(2,3,4);
		
		c.area(5);
		c.perimeter(4);
	}
}
