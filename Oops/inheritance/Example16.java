class Parent
{
	Parent(){
		System.out.println("Inside the 0 arg const -- parent");
	}
}
class Child extends Parent
{
	Child(){
		System.out.println("inside the 0 argument constructor");
	}
	Child(int a){
		System.out.println("inside the 1 arg const");
	}
}
class Example16
{
	public static void main(String[] args){
		Child ch = new Child();
		Child ch1= new Child(2); 
	}
}

// points:-- jitne bar child object create hoga utne bar parent construct call hota hai 
