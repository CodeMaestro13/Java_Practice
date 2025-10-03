class Example7
{
	public static void main(String[] args){
		    System.out.println("Start"); 
			try{
				    System.out.println("inside try block ");
					    System.out.println(10/0); 
			}
			   // System.out.println("Statement after try block and before catch block will not be used "); 

			catch(ArithmeticException ae){
				    System.out.println("inside catch block ");
					    System.out.println(10/0); 


			}
			}		
}