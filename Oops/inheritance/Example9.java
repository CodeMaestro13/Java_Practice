class Sample
{
	int a=10;
}
class Demo extends Sample
{
	int b=100;
	void m1(int c){
		System.out.println("Inside m1 method");
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}
}
class Example9
{
	public static void main(String[] args){
		
		Demo d= new Demo();
		d.m1(1000);
	}
}