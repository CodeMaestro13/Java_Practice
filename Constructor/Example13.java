class Example13
{
	Example13(){
		// this() --> is is used to call the another constructor within the same class when we have a single object in main method 
		this(10);
		System.out.println("Inside the 0 arg constructor ");
		
	}
	// parametrized constructor 
	Example13(int a){
		System.out.println("Inside the 1 arg constructor");
	}
	public static void main(String[] args){
		System.out.println("Start");
		new Example13();
		System.out.println("Ends");
		
	}
}

// points:--
// this()--> it is the method used to call the other constructor within the same class..
// this method is used when we have to call more than one constructor from only one object .


// this--> keyword--> stores the current class object address .