class Person{
	static String getName(){
		String name="Guna";
		return name;
	}
	static byte getAge(){
		byte age =22;
		return age;
	}
	
	static String getEmail(){
		String email="Guna@gmail.com";
		return email;
	}
	
	static long getMobileNo(){
		long mobile=5496947694l;
		return mobile;
	}
	
	static byte getHeight(){
		byte height =6;
		return height;
	}
	
	static byte getWeight(){
		byte weight =75;
		return weight;
	} 
	
	static int getSalary(){
		int salary =60000;
		return salary;
	}
	
	static String getBestFriendsName(){
		String friendsName="Frend";
		return friendsName;
	}
	
	static String getFatherName(){
		String fatherName="Manjunath";
		return fatherName;
	}
	
	static String getMotherName(){
		String motherName="Manjula";
		return motherName;
	}
	
	static String getAreaName(){
		String areaName="IPS Nagar";
		return areaName;
	}
	
	static String getEnemy(){
		String enemy="Na";
		return enemy;
	}
	
	static String getInspiration(){
		String inspire="Na";
		return inspire;
	}
	
}


class PersonRunner{
	public static void main(String [] args){
		
	System.out.println("Running getName");
	String nm=Person.getName();
	System.out.println("Name is "+nm);
	
	System.out.println("Running getAge");
	byte age=Person.getAge();
	System.out.println("Age is "+age);

	
	System.out.println("Running getEmail");
	String email=Person.getEmail();
	System.out.println("Email is "+email);
	
	System.out.println("Running getMobileNo");
	long mobile=Person.getMobileNo();
	System.out.println("Mobile No is "+mobile);
	
	System.out.println("Running getHeight");
	byte height=Person.getHeight();
	System.out.println("Height is "+height + "ft");
	
	System.out.println("Running getWeight");
	byte weight=Person.getWeight();
	System.out.println("Weight is "+weight);
	
	System.out.println("Running getSalary");
	int salary=Person.getSalary();
	System.out.println("Salary is "+salary);
	
	System.out.println("Running getBestFriendsName");
	String friend=Person.getBestFriendsName();
	System.out.println("Friend Name is "+friend);
	
	System.out.println("Running getFatherName");
	String father=Person.getFatherName();
	System.out.println("Father Name is "+father);
	
	System.out.println("Running getMotherName");
	String mother=Person.getMotherName();
	System.out.println("Mother Name is "+mother);
	
	System.out.println("Running getAreaName");
	String area=Person.getAreaName();
	System.out.println("Area Name is "+area);
	
	System.out.println("Running getEnemy");
	String enemy=Person.getEnemy();
	System.out.println("Enemy is "+enemy);
	
	System.out.println("Running getInspiration");
	String inspiration=Person.getInspiration();
	System.out.println("Inspiration is "+inspiration);
}
}