class Example5{
	// constructor making 
	Example5(){
		System.out.println("Inside the constructor -- 0 argument ");
	}
	Example5(int a){
		System.out.println("Inside the constructor --> 1 argument ");
		
	}
	
	public static void main(String[] args){
		System.out.println("Start");
		// object creation
		Example5 ref= new Example5(); 
		Example5 ref1= new Example5(10);
		System.out.println("Stops");
		
	}
}

// pointe:-- 

// within the constructor we can create multiple constructors but their is one condition 
// we need to create multiple object for that and the constructor should not be same ( it must be having different parameters) 