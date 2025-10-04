class Example11
{
	public static void main(String[] args){
		System.out.println("Starts");
		Example11 ref = new Example11();
		System.out.println("Ends");
		
		
	}
}

// points :--
// here if we didnt create any constructor by default our constructor is getting called 
// if we do not create any constructor then java will create a default constructor with zero argument or empty implementation constructor 



//C:\Program Files\EditPlus\JAVA\Constructor>javap Example11
//Compiled from "Example11.java"
//class Example11 {
  //Example11(); --> this is the default constructor getting called 
  //public static void main(java.lang.String[]);
// }