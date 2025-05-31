package HOD_SubClass;

import Teacher_SuperClass.Teacher;
import container.Address;

public class Hod extends Teacher{
	private String dept1;
	private int hra;
	private int da;
	private int tax;
	private double totalsalary;
	private int exp;
	
	public Hod(String name, int age, String mob, Address address, int id, String dept, float salary,String dept1,int hra,int da,int tax,int exp) {
		super(name, age, mob, address, id, dept, salary);
		this.dept1 = dept1;
		this.hra = hra;
		this.da = da;
		this.tax = tax;
		this.exp = exp;
	}

	public String getDept1() {
		return dept1;
	}

	public void setDept1(String dept) {
		this.dept1 = dept;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getDa() {
		return da;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public double getTotalsalary() {
		return totalsalary;
	}

	public void setTotalsalary(double totalsalary) {
		this.totalsalary = totalsalary;
	}
    	
	
	

}
