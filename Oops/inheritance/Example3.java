class A
{
	static void m1(){
		System.out.println("Inside class A in static m1 method ");
	}
}
class B extends A{
	void m2(){
		System.out.println("Inside class B in m2 method ");
	}	
}
class Example3
{
	public static void main(String[] args)
	{
		// object creation 
		B b= new B();
		b.m1();
		b.m2();
		
	}
	
}

// points :-- both static and non-static members [variables/ methods ] are the part of inheritance 
