class Sample
{
	// non static block
	{
		System.out.println("Inside the non Static block");
	}
	Sample(){
		System.out.println("Inside the 0 arg const");
	}
}

class Example8
{
	public static void main(String[] args){
		System.out.println("Start");
		// constructor calling 
		new Sample();
		System.out.println("Stops");
	}
}

// points:--
 // in this example we will get to know that the non static block will execute before constructor call
 // so whenever i want to execute something before constructor i will write that code into non static block 