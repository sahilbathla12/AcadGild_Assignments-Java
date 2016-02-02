package session4;

public class EmployeeClass {

	int empID, salaray; ;
	double WorkingHours;
	String name, Department, Project, joiningdate, Grade; 
	boolean onLeave=true;
	public static void main(String[] args) {
		
		EmployeeClass firstEmployee = new EmployeeClass();
		firstEmployee.Department="CMS";
		firstEmployee.Project="NFV";
		firstEmployee.empID=2332233;
		firstEmployee.Grade="Developer";
		firstEmployee.onLeave=true;
		firstEmployee.name="ABC";
		
		
		EmployeeClass secondEmployee = new EmployeeClass();
		secondEmployee.Department="Services";
		secondEmployee.Project="IOT";
		secondEmployee.empID=123;
		secondEmployee.Grade="Architect";
		secondEmployee.onLeave=false;
		secondEmployee.name="XYZ";
		System.out.println("\n\n first empoyee\n");
		firstEmployee.EmployeeDetails();
		firstEmployee.isworking();
		System.out.println("\n\n Second empoyee\n");
		secondEmployee.EmployeeDetails();
		secondEmployee.isworking();
		
		
	}
	
	public void isworking()
	{
		if(!onLeave)
		{
			System.out.println(name+" is Working");
			
		}
		else
		{
			System.out.println(name+" is not Working");
		}
	}
	
	public void EmployeeDetails()
	{
		
		System.out.println("Employee works in "+Department );
		System.out.println("Employee id in "+empID );
		System.out.println("Employee project is "+Project );
		System.out.println("Employee Grade is "+Grade );
		
	}

	
}

