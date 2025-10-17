final class Parent
{
	void m1(){System.out.println("Inside the parent class m1 method");}
}
class child extends Parent
{
	void m2(){System.out.println("Inside m2 method ");}
}
class Example8
{
	public static void main(String[] args){
		child ch = new child();
		ch.m1();
		ch.m2();
	}
}