 private class Student
{
	private String name;
	int roll;
	int age;
	String collage_name;
	Student(){
		
	}
	// getter 
	Student(String name,int roll,int age,String collage_name){
		this.name=name;
		this.roll=roll;
		this.age=age;
		this.collage_name=collage_name;
	}
	
	// getter mathod
	String getName(){
		return this.name;
	}
	
	// getter method 
	int getRoll(){
		return this.roll;
	}
	
	
	// setter method 
	void setName(String name){
		this.name = name;	
	}	
	// setter
	void setRoll(int roll){
		this.name=name;
	}
	// setter 
	void setAge(){
		this.age=age;
	}
	// setter 
	void setCollageName(String collage_name){
		this.collage_name=collage_name;
	}
	
	
}

class LogicalExample
{
	public static void main(String[] args){
		
		List<Student> std= new ArrayList<>();
		Student s2 = new Student("krishna",101,23,"JSPM");
		std.add(new Student("krishna",101,23,"JSPM"));
		std.add(s2);
		
		// sort bases on 
		
		
	}
}