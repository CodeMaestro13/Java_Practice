class Parent
{
	Parent(){
		System.out.println("Inside the 0 arg const-- Parent ");
	}
}
class Child extends Parent
{
	Child(){
		System.out.println("inside the 0 arg -- const -- Child");
	}
}

class Example15
{   public static void main(String[] args){
	
	Child ch = new Child();
   }
}

// points:--
