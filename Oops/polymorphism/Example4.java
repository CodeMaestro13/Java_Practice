
// real life example 
class Flipkart
{
	void payment(){
		System.out.println("Pay by Cash Bussinesslogic");
	}
	void payment(String upi){
		System.out.println("Pay by Upi Bussinesslogic");
	}
	void payment(int debitCredit){
		System.out.println("Pay by debitcard/credit card Bussinesslogic");
	}
	void payment(float phonepe)
	{
		System.out.println("Pay by phonepe bussinesslogic");
	}
}
class Example4
{
	public static void main(String[] args){
		Flipkart cust1 = new Flipkart();
		cust1.payment("kri");
	}
}