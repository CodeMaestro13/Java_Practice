class A
{
	int a =100;
	void m1(){
	System.out.println("Inside m1 method "+ a );	
	}
}
class B extends A
{
	float b = 200.5f;
	
	void m2(){
		System.out.println("Inside m2 method " + b);	
	}
}
class Example2
{
	public static void main(String[] args)
	{
		// child ka object create 
		B ref = new B();
		ref.m1();
		ref.m2();
		
	}
}

// points :-- both variable and methods are the part of inheriance 
