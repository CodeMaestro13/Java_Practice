class Example2
{
	// static block
	static
	{
		System.out.println("inside the static block--1 ");
	}
	
	static
	{
		System.out.println("inside the static block--2 ");
	}
	
	public static void main(String[] args){
		System.out.println("Start");
		
		System.out.println("Stop");
	}
}
// points te exeution is from top to bottom  
 