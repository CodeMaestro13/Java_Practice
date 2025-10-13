class Emp
{
	int empId;
	String empName;
	// constructor
	Emp(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
	
}
class Example7
{
	public static void main(String[] args){
	 // object creation 
	 Emp e1= new Emp(101,"Krishna");
	 Emp e2= new Emp(102,"Shekhar");
	 Emp e3 = new Emp(103,"Bhavsar");
	 
	 // array creation 
	  Emp[] e={e1,e2,e3};
	  // for each loop 
	  for(Emp ee:e){
		System.out.println("Id is " + ee.empId + " " + " name is "+ ee.empName);
	  }
	}
}