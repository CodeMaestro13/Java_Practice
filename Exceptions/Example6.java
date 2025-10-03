class Example6{
	public static void main(String[] args){
		    System.out.println("Start");
			// for excaption handling we uses 2 types 1) try-catch method 2)- throws keyword 
			
			try{
				System.out.println("inside try block ");
				System.out.println(10/0); // --> gives Arthematic exception 
			}
			// note:-- independently try block will only not be executed 
			
			catch(NullPointerException  ae){
				// here we have written different exception which is not occuring --> so it will gives an error 
				System.out.println("Inside Catch Block");
				System.out.println(10/2);
			}
			
			System.out.println("Stops ");
	}
}