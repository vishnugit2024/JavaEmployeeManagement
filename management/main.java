package sys.management;
import java.util.Scanner;

public class main{
	public static void main(String[] args) throws Exception {
		
		EmployeeDaoInterface ep= new EmployeeDao(); 
		
		System.out.println("<<Welcome to Employee management application>> ");
		do {
			System.out.println("1. Add Employee\n"
                              +"2. Show All Employee\n"					
					          +"3. Show Employee based on id\n"
                              +"4. Update the Employee\n"
					          +"5. Delete the Employee\n"
			                  +"6. Exit the Application");
			System.out.println("Enter a Choice..");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				Employee emp = new Employee();
				System.out.println("Enter a Employee ID        :");
				int empid = sc.nextInt();
				System.out.println("Enter a Employee Name      :");
				String name = sc.next();
				System.out.println("Enter a Employee Job Title :");
				String title = sc.next();			
				System.out.println("Enter a Employee Salary    :");
				float salary = sc.nextFloat();
				System.out.println("Enter a Employee Address   :");
				String address = sc.next();
				
				emp.setId(empid);
				emp.setName(name);
				emp.setJobTitle(title);
				emp.setSalary(salary);
				emp.setAddress(address);
			
				ep.createEmployee(emp);	
				
			  break;
			  
			case 2:
				ep.showAllEmployee();
				break;
				
			case 3:
				System.out.println("Enter Employee ID :");
				int empid1=sc.nextInt();
				ep.showEmployeeOnId(empid1);
				
				break;
				
			case 4:
				System.out.println("Enter Employee ID to update details :");
				int empid2 = sc.nextInt();
				ep.showEmployeeOnId(empid2);
				System.out.println("Enter number which one want to update :\n"
                        +"1.Update Name\n"					
				        +"2.Update Job title\n"
                        +"3.Update Salary\n"
				        +"4.Update Address\n"   );
				int ch1 = sc.nextInt();
				switch(ch1)
				{
				case 1:
					System.out.println("Enter new name :");
					String name1 = sc.next();
					ep.updateName(empid2, name1);
					
					break;
					
				case 2:
					System.out.println("Enter new job title :");
					String job = sc.next();
					ep.updateJobTitle(empid2,job);
					
					break;
					
				case 3:
					System.out.println("Enter new Salary :");
					String wage = sc.next();
					ep.updatesalary(empid2, wage);
					
					break;
					
				case 4:
					System.out.println("Enter new Address :");
					String addre = sc.next();
					ep.updatesalary(empid2, addre);
					
					break;
				}break;
				
			case 6:
				ep.Exit();
				break;
			default:
				  System.out.println("Enter a valid Choice..!!");
				  break;
			}
			
		}while(true);
		
	}
}