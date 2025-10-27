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
		super();
		System.out.println("Inside the 0 arg const -- Child");
	}
}

class Example11
{
	public static void main(String[] args){
		// child class ka object create krt ahe 
		System.out.println("Starts");
		Child ch = new Child();
		System.out.println("Stops");
	}	
}

// points :--

// this() method-->call another constructor within the same class
// super() method --> call another constructor within super class
