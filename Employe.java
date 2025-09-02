package day1;

public class Employe {
	
		String empname;
		int id;
		double salary;
		public static void main(String[] args)
		{
			Employe E1=new Employe();
					System.out.println(E1.empname);
					System.out.println(E1.id);
					System.out.println(E1.salary);
					
			Employe E2=new Employe();
			E2.empname="sudha";
			E2.id=101;
			E2.salary=30000.00;
			System.out.println("Employee Name :"+E2.empname);
			System.out.println("Employee ID :"+E2.id);
			System.out.println("Salary :"+E2.salary);
			
			Employe E3=new Employe();
			E2.empname="raghu";
			E2.id=102;
			E2.salary=30000.00;
			System.out.println("Employee Name :"+E2.empname);
			System.out.println("Employee ID :"+E2.id);
			System.out.println("Salary :"+E2.salary);
		}
	
		
}


