// static block:-- this block always execute during the clas loading time( jab class-loader load karta hai static members ko static pool me)

class Example1
{
	// static block
	static
	{
		System.out.println("inside the static block ");
	}
	
	public static void main(String[] args){
		System.out.println("Start");
		
		System.out.println("Stop");
	}
}