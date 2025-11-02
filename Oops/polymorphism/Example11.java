class Demo
{
	void m1(){
		System.out.println("Inside the m1 method -- dem0");
	}
	
}
class Sample extends Demo
{
	void m1(){
		System.out.println("inside the m1 method -- sample");
	}
}

class Example11
{
	public static void main(String[] args){
		// child class ka obj -- is preferable 
		Sample s1= new Sample();
		s1.m1();
		
	}
}