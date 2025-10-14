class Emp
{
	int empId;
	String empName;
	Emp(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
}
class Example9
{
	public static void main(String[] args){
		System.out.println("Start");
		Emp[] e ={ new Emp(1010 , "Krishna "), new  Emp(2020 , "Kabir"),new Emp(3030, "Singh")};
		// for each loop 
		for(Emp ee:e){
			System.out.println(ee.empId + "--" + ee.empName);
		}
		System.out.println("Ends");
		
	}
	
}
