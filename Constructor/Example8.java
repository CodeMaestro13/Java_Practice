class Employee
{
	// non static variable 
	int empId;
	String empName;
	// constructor for initialization 
	Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
	void getEmpInfo(){
		System.out.println("Emp Id: " + " "+ empId+ " "  + "Emp name: " + empName);
	}
}
class Example8{
	
	public static void main(String[] args){
		System.out.println("Start");
		// object creation of Employee class 
		Employee ep1=new Employee(1,"Rahul");
		ep1.getEmpInfo();
		Employee ep2= new Employee(202 ,"krishna");
		ep2.getEmpInfo();
		System.out.println(ep1.empId); // output-> 1 
		System.out.println("Stops");
		
	}
}

// points :-- this is the practical implemantation 

// when we are creating object at that time // 