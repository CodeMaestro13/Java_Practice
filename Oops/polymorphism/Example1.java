class Example1
{
	void m1(){
		System.out.println("inside m1 method - 0 arg ");
	}
	void m1(int a){
		System.out.println("inside the  m1 methiod -- 1 arg ");
	} 
	
	public static void main(String[] args){
		Example1 ref1= new Example1();
		ref1.m1();
	}
	
}
// points:-- polymorphism:- an object having more than 1 behavour is called as polymorphic object and the concept is called as polymorphism