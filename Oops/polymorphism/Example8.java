class Hdfc
{
	Hdfc(String custName, int mobileNum){
		System.out.println("logics to create / implement the saving account");
	}
	Hdfc(String compName, String custName,int mobilenum){
		System.out.println("logics to implent / create the current account");
	}
}

class Example8
{
	public static void main(String[] args){
		Hdfc cust1= new Hdfc("krishna",12345);
		Hdfc cust2= new Hdfc("rninfo","krish",1435);
		
	}
}