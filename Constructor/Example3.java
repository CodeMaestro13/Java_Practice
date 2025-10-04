class Example3{
	// constructor making 
	Example3(){
		System.out.println("Inside the constructor how many we can create  ");
	}
	public static void main(String[] args){
		System.out.println("Start");
		// object creation
		Example3 ref= new Example3();
		Example3 ref1 = new Example3();
		Example3 ref2 = new Example3();
		System.out.println("Stops");
		
	}
}

// pointe:--  

// within the constructor based on the total no of object created that may no of times constructor will be called / and executed 