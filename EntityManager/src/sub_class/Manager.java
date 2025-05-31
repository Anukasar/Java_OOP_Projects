package sub_class;

import container.Address;

import Worker_SuperClass.worker;

public class Manager extends Employee {
	protected float tax;
	protected float da;
	protected float hra;
	protected float totalsalary;
	
	public Manager(String name, int age, String mob, Address address, int id, String dept, float salary, float tax,
			float da, float hra, float totalsalary,worker w) {
		super(name, age, mob, address, id, dept, salary, w);
		this.tax = tax;
		this.da = da;
		this.hra = hra;
		this.totalsalary = totalsalary;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	public float getTotalsalary() {
		return totalsalary;
	}
	public void setTotalsalary(float totalsalary) {
		this.totalsalary = totalsalary;
	}
	
	public void calculateSalary()
	{
		totalsalary = salary + (salary*(hra+da-tax)/100);
	}
	
	

}
