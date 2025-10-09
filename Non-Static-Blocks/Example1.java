class Example1
{
	// non static block --> it just have implementation 
	{
		System.out.println("Inside the Non-Static block ");
		
	}
	public static void main(String[] args){
		System.out.println("Start");
		new Example1();
		System.out.println("Ends");
	}
}