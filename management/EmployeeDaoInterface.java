package sys.management;

public interface EmployeeDaoInterface 
{
  //create employee
	public void createEmployee(Employee emp) throws Exception;
  //show all employee
	public void showAllEmployee() throws Exception;
  //show employee based on id
	public void showEmployeeOnId(int id) throws Exception;
	//update employee
	public void updateEmployee(int id,String name,String jobTitle,float salary,String address) throws Exception;
	//delete employee
	public void deleteEmployee(int id) throws Exception;
	
	public void Exit()throws Exception;
	
	public void updateJobTitle(int id,String jobTitle)throws Exception;
	public void updatesalary(int id,String salary)throws Exception;
	public void updateaddress(int id,String Address)throws Exception;
	public void updateName(int id, String name) throws Exception;
	
	
}
