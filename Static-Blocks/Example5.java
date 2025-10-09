class Demo
{
	static int a;
	static {
		System.out.println("Inside the static block -- demo "+a);
		a=10;
	}
}
class Example5
{
	public static void main(String[] args){
		System.out.println("Start");
		// multi class static method in static area 
		System.out.println(Demo.a);
		System.out.println("Stops");
	}
}

// points :-
// class-loading will not be responsible to load all the classes at one point of time 
// whichever the class member is required for access only that time the respective  class will be the loaded inside the memory 
// so theirfore it is not required that other class static blocks will also gets executed at the start of program execution .
