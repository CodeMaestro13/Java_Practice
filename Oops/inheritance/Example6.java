
class C
{
	void m1(){
		System.out.println("Inside the class C -- m1 method");
	}
}
class B
{
	void m1(){
		System.out.println("Inside the class B -- m1 method ");
	}
}
class A extends B,C
{
	// call m1
}
class Example6
{
	public static void main(String[] args){
		
	}
}

// points:-- one class should extends only one another class if we want to have features for different class we have to inplement the interfaces for that 
