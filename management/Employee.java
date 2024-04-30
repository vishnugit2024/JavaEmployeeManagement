package sys.management;


public class Employee {
  private int id;
  private String name;
  private String jobTitle;
  private float salary;
  private String address;
  

public Employee() {}

public Employee(int id, String name, String jobTitle,float salary, String address) {
	super();
	this.id = id;
	this.name = name;
	this.jobTitle = jobTitle;
	this.salary = salary;
	this.address = address;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}
public String getJobTitle() {
	return jobTitle;
}

public float getSalary() {
	return salary;
}
public String getAddress() {
	return address;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public float setSalary(float salary) {
	return this.salary = salary;
}
public void setAddress(String address) {
	this.address = address;
}

}

  