class Example3
{
	static
	{
		System.out.println("inside the static block--1 ");
	}
	{
		System.out.println("inside the non - static block--1 ");
	}
	
	public static void main(String[] args){
		System.out.println("Start");
		Example3 ref =new Example3();
		Example3 ref1=new Example3();
		System.out.println("Stop");
	}
}

// points :--

// static block will wxecute only once when the class loads 
// where as the non-static block will execute as many time as the object gets created .