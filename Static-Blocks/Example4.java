class Example4
{
	// static variable 
	static int a;
	static {
		System.out.println("Inside the Static Block "+ a);
		a=10;
	}
	
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println("the value of  a is "+a);
		System.out.println("Stops");
	}
}

// points :-
// what is the main purpose of a static block in real life.
// 1 to initialized the static members during the class loading time 
// 2 to implement the bussiness logic during the class loading time 
