class Example5
{
	// non static block
	{
		System.out.println("Inside the non static block ");
	}
	Example5(){
		System.out.println("Inside the 0 arg const");
	}
	Example5(int a ){
		System.out.println("Inside the 1 argument constructor");
	}
	
	public static void main(String[] args){
		System.out.println("Start");
		Example5 ref1=new Example5();
		Example5 ref2=new Example5(10);
		System.out.println("Stops");
	}
}


// points:--

	// que:- what is the primary used of Non static block / Instance Block??
	// for primarly used for 2 purpose --> to implement bussiness logic during object creation as well as to initialized non-static variable.