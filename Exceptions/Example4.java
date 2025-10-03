class Example4{
	public static void main(String[] args){
		    System.out.println("Start");
			// for excaption handling we uses 2 types 1) try-catch method 2)- throws keyword 
			
			try{
				System.out.println("inside try block ");
				System.out.println(10/0); // --> gives Arthematic exception 
			}
			catch(ArithmeticException ae){
				System.out.println("Inside Catch Block");
				System.out.println(10/2);
			}
			
			System.out.println("Stops");
			// if the exception occures in the try block only then the control will go into the catch block otherwise it will not go 
	}
}