class hdfc
{
	int amountBal;
	// non static block 
	{
		System.out.println("Inside NSB verifying aadhar card details ");
	}
	// parametrized constructor 
	hdfc(int amountBal){
		if(amountBal>=10000){
			this.amountBal=amountBal;
			System.out.println("Your account is created and Amount deposited Successfully !!");
		}
		else{
			System.out.println("Please enter the valid amount...");
		}
	}
	
	// methos 
	void getAmountBalInfo(){
		System.out.println("Amount Balance is " + amountBal);
	}
}
class hdfcBank
{
	public static void main(String[] args){
		System.out.println("Start");
		hdfc cust1 = new hdfc(10000);
		 cust1.getAmountBalInfo();
		
		System.out.println("Stops");
	}
}