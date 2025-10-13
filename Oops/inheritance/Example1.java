// parent class/ super class/ Based class
class A
{
	int a =100;
}
// child / sub/ derived class
class B extends A 
{
	float b= 200.5f;
	
}
class Example1
{
	public static void main(String[] args){
		// parent ka object 
		A ref1 = new A();
		System.out.println(ref1.a);
		//System.out.println(ref1.b);--> invaid 
		
		// child ka object 
		B ref2 = new B();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
	}
	
}

// points :-- it is best practice to create clild class object beacuse when we created parent class object then child class members are not going to inherit in it 
