package Teacher_SuperClass;

import container.Address;
import super_class.Person;

public class Teacher extends Person {
	private int id;
	private String sub;
	private float salary;
	public Teacher(String name, int age, String mob, Address address, int id, String sub, float salary) {
		super(name, age, mob, address);
		this.id = id;
		this.sub = sub;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String name) {
		this.sub = sub;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	

}
