class Parent
{
	Parent(){
		System.out.println("inside 0 args -- parent ");	
	}
	
}
class Child extends Parent
{
	Child(){
		System.out.println("Inside 0 args -- child ");
	}
}
class Example13
{
	public static void main(String[] args){
		System.out.println("Starts ");
		Child c = new Child();
		System.out.println("Stops");

	}
}
