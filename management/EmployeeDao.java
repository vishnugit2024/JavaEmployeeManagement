package sys.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao implements EmployeeDaoInterface 
{
	Connection con;
	
	@Override
	public void createEmployee(Employee emp) throws Exception {
    con = DBconnection.createDBConnetion();
    String query ="insert into EmployeeData values(?,?,?,?,?)";
    PreparedStatement pstm = con.prepareStatement(query);
    pstm.setInt(1,emp.getId());
    pstm.setString(2,emp.getName());
    pstm.setString(3,emp.getJobTitle());
    pstm.setFloat(4,emp.getSalary());
    pstm.setString(5,emp.getAddress());
    int cnt = pstm.executeUpdate();
    
    if(cnt!=0) 
    	System.out.println("Employee Inserted Succesfully..!!");
    if(cnt==0)
    	System.out.println("Employee details : are not inserted");
  }

	@Override
	public void showAllEmployee() throws Exception {
		con=DBconnection.createDBConnetion();
		String query="SELECT * FROM EMPLOYEEDATA";
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(query);
		System.out.println("Employee Details :");
		System.out.format("%s\t%s\t%s\t%s\t%s\n","ID","Name","Job Profile","Salary","Address");
		while(result.next())
		{
			System.out.println("----------------------------------------------");
			System.out.format("%d\t%s\t%s\t%f\t%s\n",
					      result.getInt(1),
					      result.getString(2) ,     
					      result.getString(3),
					      result.getFloat(4),
					      result.getString(5)  );
		}
		System.out.println("----------------------------------------------");
		
	}

	@Override
	public void showEmployeeOnId(int id)throws Exception {
		con=DBconnection.createDBConnetion();
		String query="SELECT * FROM EMPLOYEEDATA WHERE ID="+id;
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(query);
		System.out.println("Employee Details :");
		System.out.format("%s\t%s\t%s\t%s\t%s\n","ID","Name","Job Profile","Salary","Address");
		if(result.next())
		{
			System.out.println("----------------------------------------------");
			System.out.format("%d\t%s\t%s\t%f\t%s\n",
				      result.getInt(1),
				      result.getString(2) ,     
				      result.getString(3),
				      result.getFloat(4),
				      result.getString(5)  );
		}
		System.out.println("----------------------------------------------");
		}

	@Override
	public void updateEmployee(int id,String name,String jobTitle,float salary,String address)throws Exception{
		con=DBconnection.createDBConnetion();
		String query="SELECT * FROM EMPLOYEEDATA WHERE ID="+id;
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(query);
		System.out.println("Employee Details :");
		
	}

	@Override
	public void deleteEmployee(int id)throws Exception {
		/*con=DBconnection.createDBConnetion();
		String query="SELECT * FROM EMPLOYEEDATA";
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(query);*/
		
	}
	
	public void Exit()throws Exception{
		System.out.println("Thanks for using this application.!!");
		System.exit(0);
	}


	@Override
	public void updateName(int id,String name)throws Exception {
		con=DBconnection.createDBConnetion();
		String query="update employeedata set name=? where id=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1,name);
		pstmt.setInt(2,id);
		int cnt = pstmt.executeUpdate();
		if(cnt!=0)
		{
			System.out.println("Name update sucessfully...");
		}
		
	}
	@Override
	public void updateJobTitle(int id,String jobTitle)throws Exception {
		con=DBconnection.createDBConnetion();
		String query="update employeedata set JobTitle=? where id=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1,jobTitle);
		pstmt.setInt(2,id);
		int cnt = pstmt.executeUpdate();
		if(cnt!=0)
		{
			System.out.println("Job Title update sucessfully...");
		}
		
	}

	public void updatesalary(int id,String salary) throws Exception {
		con=DBconnection.createDBConnetion();
		String query="update employeedata set Salary=? where id=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1,salary);
		pstmt.setInt(2,id);
		int cnt = pstmt.executeUpdate();
		if(cnt!=0)
		{
			System.out.println("Salary update sucessfully...");
		}
		
	}

	@Override
	public void updateaddress(int id,String Address) throws Exception {
		con=DBconnection.createDBConnetion();
		String query="update employeedata set Address=? where id=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1,Address);
		pstmt.setInt(2,id);
		int cnt = pstmt.executeUpdate();
		if(cnt!=0)
		{
			System.out.println("Address update sucessfully...");
		}
		
	}

}
