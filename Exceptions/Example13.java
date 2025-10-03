class Example13{
	public static void main(String[] args){
		    System.out.println("Start"); 
			
			int[] a={10,20,30,40};
			
			try{
				System.out.println(10/0); // -> 
			    System.out.println(a[10]);
			}
			catch(ArithmeticException ae){
				System.out.println("inside the catch block-- arthimeticException");
				System.out.println(10/2);
			}
			catch(ArrayIndexOutOfBoundsException ae){
				System.out.println("inside the catch block-- arrayoutof bound exception ");
			System.out.println("Stops");


	}
}
}