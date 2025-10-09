class Example9
{
	int a;
	// non static block 
	{
		System.out.println("Inside the NSB " + a);
		a=10;
	}
	
	// zero arg const
	Example9(){
		System.out.println("inside the 0 arg const" + a);
		a=100;
	}
	// 1 arg const
	Example9(char x){
		System.out.println("Inside 1 arg const" + a);
		a=1000;
	}
		
	public static void main(String[] args){
		System.out.println("Start");
		Example9 ref1=new  Example9(); System.out.println(ref1.a);
		Example9 ref2= new Example9('x'); System.out.println(ref2.a);
		System.out.println("Stops");
	}
}