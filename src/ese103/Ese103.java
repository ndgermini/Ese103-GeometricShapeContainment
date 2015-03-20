package ese103;

import geometricshapes.*;

public class Ese103 
{
	public static void main(String[] args) 
	{
		Circle c[] = new Circle[3];
		c[0] = new Circle(10, 20, 4);
		c[1] = new Circle(10, 20, 60);
		c[2] = new Circle(20, 40, 80);
		
		
		controlContainment(c[0], c[1]);
		controlContainment(c[0], c[2]);
		controlContainment(c[1], c[0]);
		controlContainment(c[1], c[2]);
		controlContainment(c[2], c[0]);
		controlContainment(c[2], c[1]);
		System.out.println();
		
		
	}
	
	private static void controlContainment(Circle c0, Circle c1)
	{
		if(c0.contains(c1))
			System.out.println(c0 + " contiene il -------> " + c1);
		else
			System.out.println(c0 + " non contiene il ---> " + c1);
	}
	
}
	
		
