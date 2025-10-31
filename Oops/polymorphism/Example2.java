class Example2
{
	void test1(int a){
		System.out.println("inside m1 method - 1 arg-- int  ");
	}
	void test1(float b){
		System.out.println("inside the  m1 methiod -- 1 arg--float ");
	} 
	
	public static void main(String[] args){
		System.out.println("Start");
		Example2 ref1= new Example2();
		ref1.test1(20.3f);
		System.out.println("Stops");
	}
	
}

// Default constructor ? created by compiler when you write none.
// Zero-argument constructor ? created by you manually, even though it has zero parameters.