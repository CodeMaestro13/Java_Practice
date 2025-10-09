class Example2
{
	// non static block --> it just have implementation 
	{
		System.out.println("Inside the Non-Static block ");
	}
	// constructor
	Example2(){
		System.out.println("Inside 0 arg const");
	}
	public static void main(String[] args){
		System.out.println("Start");
		Example2 ref = new Example2();
		System.out.println("Ends");
	}
}

// points:- 1) to create a non static block , we need to create an object.
// now 1 question--> out of non-static block and constructor --> which execute firstly--> that is non static block will execute then our constructor gets execute.

