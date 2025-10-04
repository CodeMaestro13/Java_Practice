class Sample
{
	Sample(int a ){
		System.out.println("Inside 1 arugument constructor " + a );
	}
}

class Example12
{
	// constructor 
	
	public static void main(String[] args){
		System.out.println("Starts");
         new Sample(500);
		 new Sample();
		System.out.println("Ends");
		
		
	}
}