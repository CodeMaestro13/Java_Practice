class Example8
{
	public static void main(String[] args){
	System.out.println("Starts");
	 
	 // array creation 
	  int[] arr= new int[3];
	  // for each loop 
	  for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	  }
	  System.out.println("Ends");
	}
}

// by default value in array is zero and that is set by complier itself 
// for int --> 0
// for float--> 0.0
// for String --> null(it store null by compiler )

//imp 

// if we do not initialized the array then the compiler by default initialized the array with default values for premitive integer and float it will display default values as 0 and 0.0
// for predefine and user define class objects it will display it as null.