class Example1
{
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println(10/0); // causing Arthematic exception --> which is unchecked exception ( this exception is checked by JVM  so ) 
		System.out.println("Stop");
	}
}