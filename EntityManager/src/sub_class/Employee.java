package sub_class;

import Worker_SuperClass.worker;
import container.Address;
import super_class.Person;

public class Employee extends Person {

	protected int id;
	protected String dept;
	protected float salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String mob, Address address, int id, String dept, float salary, worker worker1) {
		super(name, age, mob, address);
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
