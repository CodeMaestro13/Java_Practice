class Example4
{
	// non static block --> it just have implementation 
	{
		System.out.println("Inside the Non-Static block 1 ");
	}
	
	{
		System.out.println("Inside the Non-Static block 2 ");
	}
	
	public static void main(String[] args){
		System.out.println("Start");
		Example4 ref = new Example4();
		System.out.println("Ends");
	}
}
// whenever their are multiple NSB then the flow of execution will me from Top to Bottom.