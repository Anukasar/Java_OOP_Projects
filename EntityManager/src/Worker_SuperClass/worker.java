package Worker_SuperClass;
import container.Address;
import super_class.Person;

public class worker extends Person{
	private int wid;
	private String deptName;
	private int totalSalary;
	public worker(String name, int age, String mob, Address address,  int wid, String deptName) {
		super(name, age, mob, address);
		this.wid = wid;
		this.deptName = deptName;
	}

	public int getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
	
	

}
