class Parent
{
	// constructor
	Parent(){
		System.out.println("Inside the 0 arg const -- Parent");
	}
}
class Child extends Parent
{
	Child(){
		// super() --> this will call the parent class constructor 
		System.out.println("Inside the 0 arg const -- Child");
		super();  // invalid 
	}
}

class Example12
{
	public static void main(String[] args){
		// child class ka object create krt ahe 
		System.out.println("Starts");
		Child ch = new Child();
		System.out.println("Stops");
	}	
}
																							
// points :--  super() method is always have to be the first statement in the constructor 

