package FullTimeEmployee;

import Worker_SuperClass.worker;
import container.Address;

public class FullTime extends worker {
      private int salary;
      private int extraTime;
      private int rph;
	public FullTime(String name, int age, String mob, Address address, int wid, String deptName,
			int salary, int extraTime, int rph) {
		super(name, age, mob, address, wid, deptName);
		this.salary = salary;
		this.extraTime = extraTime;
		this.rph = rph;
		super.setTotalSalary(salary+(extraTime*rph));
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
		super.setTotalSalary(salary+(extraTime*rph));
	}
	public int getExtraTime() {
		return extraTime;
	}
	public void setExtraTime(int extraTime) {
		this.extraTime = extraTime;
	}
	public int getRph() {
		return rph;
	}
	public void setRph(int tph) {
		this.rph = tph;
		super.setTotalSalary(salary+(extraTime*rph));
	}
      
	
}
