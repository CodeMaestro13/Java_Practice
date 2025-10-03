class Example5{
	public static void main(String[] args){
		    System.out.println("Start");
			// for excaption handling we uses 2 types 1) try-catch method 2)- throws keyword 
			
			try{
				System.out.println("inside try block ");
				System.out.println(10/2); // --> gives Arthematic exception 
			}
			// note:-- independently try block will only not be executed 
			
			catch(ArithmeticException ae){
				System.out.println("Inside Catch Block");
				System.out.println(10/2);
			}
			
			// note:-- if their is any error occuring into the try block then only the flow will come to the catch block otherwise not come to catch block 
			System.out.println("Stops ");
	}
}