package super_class;

import Worker_SuperClass.worker;
import container.Address;

public class Person {
	protected String name;
	protected int age;
	protected String mob;
	protected Address address;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String mob, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.mob = mob;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
