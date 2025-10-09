class Example3
{
	// non static block --> it just have implementation 
	{
		System.out.println("Inside the Non-Static block ");
	}
	public static void main(String[] args){
		System.out.println("Start");
		Example3 ref = new Example3();
		Example3 ref1 = new Example3();
		Example3 ref2 = new Example3();
		System.out.println("Ends");
	}
}

// based on the no of time we created an object-> that many number of time our instance block will be gets executed.

// no of time obj created--> no of time instance block created.